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

import org.ubicompforall.descriptor.UbiCompDescriptorPackage;
import org.ubicompforall.simplelanguage.SimpleLanguagePackage;
import org.ubicompforall.simplelanguage.Task;
import org.ubicompforall.simplelanguage.UserService;
import org.ubicompforall.ubicomposer.util.UserServiceUtils;

import android.app.Activity;
import android.net.Uri;
import android.widget.Toast;

/**
 * Abstract class for UbiComposer editor activities that assists in 
 * will load and save the user service when the activity is 
 * resumed and paused, and that provides facilities for retrieving 
 * the current user service and current task being edited based
 * on information in the intent.
 *  
 * @author erlend
 *
 */
public abstract class AbstractUbiComposerActivity extends Activity {

	private UserService userService = null;
	private Uri userServiceUri;
	private boolean firstResume = true;
	private Task task = null;

	
	/**
	 * Retrieve the uri of the user service from the intent, and retrieve
	 * the user service from the file if the uri is valid.
	 *  
	 * @return The retrieved user service, or null if it could not be retrieved
	 */
	protected UserService retrieveUserServiceFromIntent() {
		userService = null;
        Uri fileUri = this.getIntent().getData();
        if (fileUri != null) {
           	userService = openFile(fileUri);
        }		
        return userService;
	}
	
	/**
	 * Return the current task based on information in the intent. If
	 * required, the user services will first be retreived.
	 * @return The current task or null if the task or user service could not be retreived
	 */
	protected Task retrieveTaskFromIntent() {
        int taskIndex = 0; // default
        if ((getUserService() != null) && (this.getIntent().getExtras().containsKey("task"))) {
        	taskIndex = getIntent().getExtras().getInt("task");
            task = userService.getTasks().get(taskIndex);
            return task;
        }
       	return null;
 	}	
	
	/** 
	 * Get the current user service, retrieving it based on the intent if 
	 * if this is the first call to retrieve it.
	 * 
	 * @return The current user service
	 */
	public UserService getUserService() {
		if (userService == null)
			retrieveUserServiceFromIntent();
		return userService;
	}

	/** 
	 * Get the current task, retrieving it based on the intent if 
	 * if this is the first call to retrieve it.
	 * 
	 * @return The current task 
	 */
	public Task getTask() {
		if (task == null)
			retrieveTaskFromIntent();
		return task;
	}
	
	
	/**
	 * Update the views of the activity to show the current (part of the) 
	 * user service model.
	 * Subclasses must override this method to update the views.
	 */
	protected abstract void updateViewsFromModel();
	
	/**
	 * Update the current (part of the) user service model with the current values
	 * of any (changed) views in the activity.
	 * Subclasses must override this method to update the model.
	 */
	protected abstract void updateModelFromViews();
	

	/**
	 * Load the user service from the specified uri, and set the current
	 * user service URI and user service of the activity
	 * @param fileUri The uri of the file containing the user service
	 * @return The loaded uses service
	 */
	protected UserService openFile(Uri fileUri) {
		@SuppressWarnings("unused")
		SimpleLanguagePackage pkg = SimpleLanguagePackage.eINSTANCE;
		@SuppressWarnings("unused")
		UbiCompDescriptorPackage pkg2 = UbiCompDescriptorPackage.eINSTANCE;
	
		try {
			userService = UserServiceUtils.loadUserService(fileUri.getPath());
			userServiceUri = fileUri;
			if (userService == null)			
				Toast.makeText(this, "User service " + fileUri.getLastPathSegment() + " failed to load", Toast.LENGTH_LONG).show();	
		} catch (Exception e) {
			userService = null;
			Toast.makeText(this, "Failed to load user service " + fileUri.getLastPathSegment() + " error: " + e.toString() , Toast.LENGTH_LONG).show();	
		}
		return userService;
	}

	/**
	 * Load the user service using the currently user service URI of the activity 
	 * @return true if the user service was loaded successfully, otherwise false
	 */
	protected boolean loadUserService() {
		try {
			userService = UserServiceUtils.loadUserService(userServiceUri.getPath());
		} catch (Exception e) {
			userService = null;
			Toast.makeText(this, "Failed to load user service " + userServiceUri.getLastPathSegment() + " error: " + e.toString() , Toast.LENGTH_LONG).show();
			return false;
		}
		return true;
	}
	
	/**
	 * Save the current user service to the user service URI for the activity
	 */
	protected void saveUserService() {
		if (userServiceUri != null) {
			UserServiceUtils.saveUserService(userServiceUri.getPath(), userService);
		}
	}
	
    @Override
	protected void onPause() {
    	// When paused, first update the user service model for any changes made 
    	// in the views, and then save the service before proceeding to pause
    	updateModelFromViews();
    	saveUserService();
		super.onPause();
	}

	@Override
	protected void onResume() {
		super.onResume();
		// When resuming the activity, first load the user service from file 
		// unless this the user service has just been created (in which case it 
		// has already been loaded). Then update the views from the model.
		if (firstResume == false) // Do not relaod when we have just loaded for start
			loadUserService();
		firstResume = false;
		updateViewsFromModel();
	}	
   
    
}