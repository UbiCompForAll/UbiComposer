/**
    @contributor(s): Erlend Stav (SINTEF)

	Copyright 2012 SINTEF, http://www.sintef.no
	
	This software was developed in the UbiCompForAll project.
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership and the project.
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.ubicompforall.ubicomposer.android;

import java.util.List;

import org.ubicompforall.descriptor.BuildingBlockDesc;
import org.ubicompforall.descriptor.TriggerDesc;
import org.ubicompforall.simplelanguage.SimpleLanguageFactory;
import org.ubicompforall.simplelanguage.Step;
import org.ubicompforall.simplelanguage.Task;
import org.ubicompforall.simplelanguage.Trigger;
import org.ubicompforall.simplelanguage.UserService;
import org.ubicompforall.ubicomposer.util.DescriptorLibraryUtils;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This activity is used to edit the details of a Task, including
 * changing its trigger and adding, deleting and reordering its
 * step sequence. 
 * The activity will load the UserService specified in the data part 
 * of the intent, and expects intent extras with key "task" that 
 * specifies the task sequence number within the user service. 
 * The activity will load the user service from file on creation and
 * on resume, and will save to file on pause.
 *  
 * @author erlend
 *
 */
public class TaskActivity extends AbstractUbiComposerActivity {
	Uri userServiceUri;
	BuildingBlockListAdapter<Step> taskListAdapter;
	ListView stepListView;
	int taskIndex;
	Task task;
	View triggerView;
	EditText taskNameText;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserService userService = null;
        taskIndex = 0; // default
        if (this.getIntent().getExtras().containsKey("task")) {
        	taskIndex = getIntent().getExtras().getInt("task");
			
	        Uri fileUri = this.getIntent().getData();
	        if (fileUri != null) {
	        	userServiceUri = fileUri;
	           	userService = openFile(fileUri);
	        }
        }
        
        if (userService == null) {
            ModelUtils.copyAssetFiles(this);
        	userService = ModelUtils.createModel(this, "DebugService");
        }			

        task = userService.getTasks().get(taskIndex);
        setContentView(R.layout.ubicomposer_task);
        taskNameText = (EditText)this.findViewById(R.id.ubicomposer_taskNameText);
        stepListView = (ListView)this.findViewById(R.id.ubicomposer_stepListView);
        stepListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				editStep(arg2);
			}
		});
//        stepListView.setOnLongClickListener(new)
        this.registerForContextMenu(stepListView);
        ImageButton addStepButton = (ImageButton)this.findViewById(R.id.ubicomposer_addStepButton);
        addStepButton.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				showDialog(SELECT_STEP_DIALOG);
			}       	
        });
        
        
        // Trigger
        FrameLayout triggerContainerView = (FrameLayout)this.findViewById(R.id.ubicomposer_triggerFrameLayout);
        LayoutInflater inflater = LayoutInflater.from(this);
        triggerView = inflater.inflate(R.layout.ubicomposer_step_layout, null);
        triggerView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (task.getTrigger() == null) 
					showDialog(SELECT_TRIGGER_DIALOG);
				else				
					editTrigger();
			}});
        this.registerForContextMenu(triggerView);
        triggerContainerView.addView(triggerView);
    }

    private void updateTriggerView() {
        ImageView triggerIcon = (ImageView)triggerView.findViewById(R.id.ubicomposer_stepIconView);
		TextView triggerMainText = (TextView)triggerView.findViewById(R.id.ubicomposer_mainStepText);
		TextView triggerMinorText = (TextView)triggerView.findViewById(R.id.ubicomposer_minorStepText);
		Trigger trigger = task.getTrigger();
		
		if (trigger != null) {
			String iconFileName = "";
			try {
				iconFileName = this.getFileStreamPath(trigger.getDescriptor().getIconUrl()).getAbsolutePath();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			triggerIcon.setImageURI(Uri.parse(iconFileName));
			triggerMainText.setText(trigger.getDescriptor().getUserFriendlyName());
			triggerMinorText.setText(trigger.getName());		
		} else {
			triggerIcon.setImageURI(null);
			triggerMainText.setText("<< press to add trigger >>");
			triggerMinorText.setText("");
		}
		
    }
    
    private void editStep(int stepIndex) {
		if ((stepIndex < 0) || (getUserService().getTasks().get(taskIndex).getStepSequence().size() <= stepIndex)) {
			Toast.makeText(this, "Task selection out of range", Toast.LENGTH_SHORT).show();
			return;
		}			
		Intent stepEditIntent = new Intent(this, EditStepActivity.class);
		stepEditIntent.setData(userServiceUri);
		stepEditIntent.putExtra("task", taskIndex); 
		stepEditIntent.putExtra("step", stepIndex); 
 		this.startActivity(stepEditIntent);    	
    }
    
    private void removeStep(int stepIndex) {
    	Step step = taskListAdapter.getItem(stepIndex);
    	if (step != null)
    		taskListAdapter.remove(step);
    }
 
    private void moveStep(int stepIndex, boolean up) {
    	Step step = taskListAdapter.getItem(stepIndex);
    	if (step != null) {
    		if (up && (stepIndex > 0)) {
    			taskListAdapter.remove(step);
    			taskListAdapter.insert(step, stepIndex-1);
    		}
    		if (!up && (stepIndex < taskListAdapter.getCount()-1)) {
    			taskListAdapter.remove(step);
    			taskListAdapter.insert(step, stepIndex+1); 			
    		}
    	}
    }
    
 
    private void editTrigger() {
    	if (task.getTrigger() != null) {
    		Intent tiggerEditIntent = new Intent(this, EditTriggerActivity.class);
    		tiggerEditIntent.setData(userServiceUri);
    		tiggerEditIntent.putExtra("task", taskIndex); 
    		this.startActivity(tiggerEditIntent);    
    	}   	
    }

    int stepSelectedInContextMenu = -1;
    
    @Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		if (v.getId() == R.id.ubicomposer_stepListView) {
			getMenuInflater().inflate(R.menu.step_list_context_menu, menu);
			menu.setHeaderTitle("Step control:");
			stepSelectedInContextMenu = ((AdapterView.AdapterContextMenuInfo)menuInfo).position;
		}
		else if (v == triggerView) {
			getMenuInflater().inflate(R.menu.trigger_context_menu, menu);
			menu.setHeaderTitle("Trigger control:");			
		}
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		super.onContextItemSelected(item);
		switch (item.getItemId()) {
		case R.id.ubicomposer_edit_step: 
			if (stepSelectedInContextMenu != -1)
				editStep(stepSelectedInContextMenu);
			break;
		case R.id.ubicomposer_remove_step:
			if (stepSelectedInContextMenu != -1)
				removeStep(stepSelectedInContextMenu);			
			break;
		case R.id.ubicomposer_move_step_down:
			if (stepSelectedInContextMenu != -1)
				moveStep(stepSelectedInContextMenu, false);
			break;
		case R.id.ubicomposer_move_step_up:
			if (stepSelectedInContextMenu != -1)
				moveStep(stepSelectedInContextMenu, true);
			break;
		case R.id.ubicomposer_edit_trigger:
			editTrigger();
			break;
		case R.id.ubicomposer_change_trigger:
			showDialog(SELECT_TRIGGER_DIALOG);
			break;
		}		
		stepSelectedInContextMenu = -1;
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add("Add step")
			.setIcon(android.R.drawable.ic_menu_add)
			.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				@Override
				public boolean onMenuItemClick(MenuItem arg0) {
					showDialog(SELECT_STEP_DIALOG);
					return true;
				}});
		menu.add("Change trigger")
			.setIcon(android.R.drawable.ic_menu_edit)
			.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				@Override
				public boolean onMenuItemClick(MenuItem arg0) {
					showDialog(SELECT_TRIGGER_DIALOG);
					return true;
				}});
	
		return true;
		
	}

    static final int SELECT_STEP_DIALOG = 1;
    static final int SELECT_TRIGGER_DIALOG = 2;

	@Override
	protected Dialog onCreateDialog(int id) {
		switch(id) {
			case SELECT_STEP_DIALOG:
				return createSelectStepDialog();
			case SELECT_TRIGGER_DIALOG:
				return createSelectTriggerDialog();
		}
		return super.onCreateDialog(id);
	}

	// TODO: Handle refresh of dialogs
	
	private Dialog createSelectStepDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Select step to add");
		ListAdapter adapter = new BuildingBlockDescListAdapter(this, R.layout.ubicomposer_buildingblockdesc_layout, R.id.ubicomposer_buildingBlockNameText, getBuildingBlockDescs());
		
		builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				addStepToTask(arg1);
			}} );
		return builder.create();
	}

	List<BuildingBlockDesc> triggerDescList;
	
	private Dialog createSelectTriggerDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Select trigger for the task:");
		triggerDescList = DescriptorLibraryUtils.getTriggerDescs(getUserService());

		ListAdapter adapter = new BuildingBlockDescListAdapter(this, R.layout.ubicomposer_buildingblockdesc_layout, R.id.ubicomposer_buildingBlockNameText, triggerDescList);
		
		builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				addTriggerToTask((TriggerDesc)triggerDescList.get(arg1));
			}} );
		return builder.create();
	}		
	
	private List<BuildingBlockDesc> getBuildingBlockDescs() {
		return DescriptorLibraryUtils.getStepDescs(getUserService());
	}	

	private void addTriggerToTask(TriggerDesc triggerDesc) {
		Trigger trigger = SimpleLanguageFactory.eINSTANCE.createTrigger();
		trigger.setName(triggerDesc.getUserFriendlyName());
		trigger.setDescriptor(triggerDesc);
		task.setTrigger(trigger);
		updateTriggerView();
	}
	
	private void addStepToTask(int buildingBlockId) {
		try {
			List<BuildingBlockDesc> bbs = getBuildingBlockDescs();
			BuildingBlockDesc desc = (BuildingBlockDesc)bbs.get(buildingBlockId);
			Step myStep = SimpleLanguageFactory.eINSTANCE.createStep();
			myStep.setName("New " + desc.getUserFriendlyName());
			myStep.setDescriptor(desc);
			taskListAdapter.add(myStep);
			// Now, trigger editing of the new step
			editStep(taskListAdapter.getCount()-1); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	protected void updateViewsFromModel() {
        task = getUserService().getTasks().get(taskIndex);
        taskNameText = (EditText)this.findViewById(R.id.ubicomposer_taskNameText);
        taskNameText.setText(task.getName());
        taskListAdapter = new BuildingBlockListAdapter<Step>(this, R.layout.ubicomposer_step_layout, R.id.ubicomposer_mainStepText, task.getStepSequence());
        stepListView.setAdapter(taskListAdapter);
		this.updateTriggerView();
	}

	@Override
	protected void updateModelFromViews() {
		task.setName(taskNameText.getText().toString());  	
	}
			    
}