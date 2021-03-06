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


import org.ubicompforall.descriptor.BuildingBlockDesc;
import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.Task;
import org.ubicompforall.simplelanguage.UserService;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * This activity is used to edit the details of a Step building block, 
 * and supports editing of all the properties of the step.
 * The activity will load the UserService specified in the data part 
 * of the intent, and expects intent extras with keys "task" and 
 * "step" that specifies the task sequence number within the 
 * user service and the step sequence number within the task. 
 * The activity will load the user service from file on creation and
 * on resume, and will save to file on pause.
 *  
 * @author erlend
 *
 */
public class EditStepActivity extends AbstractEditBuildingBlockActivity {

	UserService userService;
	Task myTask;
	BuildingBlockDesc descr;
	int taskIndex;
	int stepIndex;
	Uri userServiceUri;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        userService = this.getUserService();
        myTask = this.getTask();
       
        // Retrieve the step number to edit from the extras of the intent, defaulting to 0
        stepIndex = 0;
        if (getIntent().getExtras().containsKey("step")) {
        	stepIndex = getIntent().getExtras().getInt("step");
        }

        // Get the step to edit from the step sequence of the task, and set as the 
        // building block being edited
        BuildingBlock buildingBlock = myTask.getStepSequence().get(stepIndex);
        setBuildingBlock(buildingBlock);
                
        setContentView(R.layout.ubicomposer_edit_step_layout);       
        setBuildingBlockView( (LinearLayout)this.findViewById(R.id.ubicomposer_stepContentView));

        // Now that the building block and building block view is set,
        // call the superclass to create editors for the properties
        createEditorsForProperties();       
        createListOfReturnValues("Return value properties:");
    }
    
	@Override
	protected void updateViewsFromModel() {
		myTask = getTask();
        BuildingBlock buildingBlock = myTask.getStepSequence().get(stepIndex);
        setBuildingBlock(buildingBlock);

        // Update the icon view to show the icon of the task
        ImageView triggerIcon = (ImageView)this.findViewById(R.id.ubicomposer_stepImageView);
		try {
			String iconFileName = this.getFileStreamPath(buildingBlock.getDescriptor().getIconUrl()).getAbsolutePath();
			triggerIcon.setImageURI(Uri.parse(iconFileName));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Update the label showing the building block name and the edit field
		// for showing and editing the user defined name
        TextView stepTypeLabel = (TextView) this.findViewById(R.id.ubicomposer_stepTypeLabel);
        stepTypeLabel.setText(buildingBlock.getDescriptor().getUserFriendlyName());
        EditText stepNameText = (EditText) this.findViewById(R.id.ubicomposer_stepNameText);
        stepNameText.setText(buildingBlock.getName());

        // Finally, call the super method to update the property editors
        super.updateViewsFromModel();		
	}


	@Override
	protected void updateModelFromViews() {
		// First, update user defined name of the building block
        BuildingBlock buildingBlock = getBuildingBlock();    
        EditText triggerNameText = (EditText) this.findViewById(R.id.ubicomposer_stepNameText);
        buildingBlock.setName(triggerNameText.getText().toString());
        // Then, call the super method to update the properties
		super.updateModelFromViews();
	}   
	
}
