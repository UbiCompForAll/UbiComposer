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
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This activity is used to manage the task list of a User Service,
 * including adding and deleting tasks. 
 * The activity will load the UserService specified in the data part 
 * of the intent on activity creation and on resume, and will save
 * to file on pause.
 *  
 * @author erlend
 *
 */
public class TaskListActivity extends AbstractUbiComposerActivity {

	Uri userServiceUri;
	TaskListAdapter<Task> taskListAdapter;
	ListView taskListView;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   
        Uri fileUri = this.getIntent().getData();
        UserService userService = null;
        if (fileUri != null) {
        	userServiceUri = fileUri;
           	userService = openFile(fileUri);
        }
        if (userService == null) {
            ModelUtils.copyAssetFiles(this);
        	userService = ModelUtils.createModel(this, "DebugService");
        }
        setContentView(R.layout.ubicomposer_task_list_layout);

        
        taskListView = (ListView)this.findViewById(R.id.ubicomposer_taskListView);
        taskListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				editTask(arg2);
			}
		});
       
        ImageButton addTaskButton = (ImageButton)this.findViewById(R.id.ubicomposer_addTaskButton);
        addTaskButton.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				showDialog(CREATE_NEW_TASK);
			}       	
        });
      
      this.registerForContextMenu(taskListView);
    }

    protected void editTask(int taskIndex) {
		if ((taskIndex < 0) || (getUserService().getTasks().size() <= taskIndex)) {
			Toast.makeText(this, "Task selection out of range", Toast.LENGTH_SHORT).show();
			return;
		}			
		Intent taskListIntent = new Intent(this, TaskActivity.class);
		taskListIntent.setData(userServiceUri);
		taskListIntent.putExtra("task", taskIndex); 
 		this.startActivity(taskListIntent);	
	}
	
	protected void removeTask(int taskIndex) {
    	Task task = taskListAdapter.getItem(taskIndex);
    	if (task != null)
    		taskListAdapter.remove(task);		
	}

    int taskSelectedInContextMenu = -1;
    
    @Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		if (v == taskListView) {
			getMenuInflater().inflate(R.menu.task_list_context_menu, menu);
			menu.setHeaderTitle("Task control:");
			taskSelectedInContextMenu = ((AdapterView.AdapterContextMenuInfo)menuInfo).position;
		}
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		super.onContextItemSelected(item);
		switch (item.getItemId()) {
		case R.id.ubicomposer_task_edit: 
			if (taskSelectedInContextMenu != -1)
				editTask(taskSelectedInContextMenu);
			break;
		case R.id.ubicomposer_task_remove:
			if (taskSelectedInContextMenu != -1)
				removeTask(taskSelectedInContextMenu);			
			break;
		}		
		taskSelectedInContextMenu = -1;
		return true;
	}
	
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add("Add task")
			.setIcon(android.R.drawable.ic_menu_add)
			.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				@Override
				public boolean onMenuItemClick(MenuItem arg0) {
					showDialog(CREATE_NEW_TASK);
					return true;
				}});
		return true;
		
	}

    static final int CREATE_NEW_TASK = 1;

	@Override
	protected Dialog onCreateDialog(int id) {
		switch(id) {
			case CREATE_NEW_TASK:
				return createNewTaskDialog();
		}
		return super.onCreateDialog(id);
	}

	List<BuildingBlockDesc> triggerDescList;
	
	private Dialog createNewTaskDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Select trigger for the new task:");
		triggerDescList = DescriptorLibraryUtils.getTriggerDescs(getUserService());

		ListAdapter adapter = new BuildingBlockDescListAdapter(this, R.layout.ubicomposer_buildingblockdesc_layout, R.id.ubicomposer_buildingBlockNameText, triggerDescList);
		
		builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				createNewTask((TriggerDesc)triggerDescList.get(arg1));
			}} );
		return builder.create();
	}
	
	private void createNewTask(TriggerDesc triggerDesc) {
		String taskName = "Task for " + triggerDesc.getUserFriendlyName();
		Task newTask = SimpleLanguageFactory.eINSTANCE.createTask();
		newTask.setName(taskName);
		Trigger trigger = SimpleLanguageFactory.eINSTANCE.createTrigger();
		trigger.setName(triggerDesc.getUserFriendlyName());
		trigger.setDescriptor(triggerDesc);
		newTask.setTrigger(trigger);
		
		taskListAdapter.add(newTask);
		saveUserService();
		
		editTask(taskListAdapter.getCount()-1);
	}
	
	protected void updateModelFromViews() {
		// Nothing to do here
	}
	
	protected void updateViewsFromModel() {
        taskListAdapter = new TaskListAdapter<Task>(this, R.layout.ubicomposer_task_list_layout, R.id.ubicomposer_taskItemNameText,
        		  getUserService().getTasks());
        taskListView.setAdapter(taskListAdapter);
        TextView taskHeader = (TextView)this.findViewById(R.id.ubicomposer_taskListLabel);
        taskHeader.setText("Tasks in " + getUserService().getName());
 	}

}

