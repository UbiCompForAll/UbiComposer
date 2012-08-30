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
package org.ubicompforall.ubicomposer.android.app;

import java.io.File;
import java.io.FilenameFilter;

import org.ubicompforall.descriptor.UbiCompDescriptorPackage;
import org.ubicompforall.library.communication.CommunicationFactory;
import org.ubicompforall.simplelanguage.SimpleLanguagePackage;
import org.ubicompforall.simplelanguage.UserService;
import org.ubicompforall.simplelanguage.runtime.RuntimeEnvironment;
import org.ubicompforall.ubicomposer.android.ModelUtils;
import org.ubicompforall.ubicomposer.android.TaskListActivity;
import org.ubicompforall.ubicomposer.util.UserServiceUtils;
import org.ubicompforall.ubicomprun.android.RuntimeEnvironmentInstance;
import org.ubicompforall.ubicomprun.android.UserServiceExecutionService;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class UbiComposerActivity extends Activity {

	UserService userService;
	String fileName;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        ModelUtils.copyAssetFiles(this);
        setContentView(R.layout.ubicomposer);
        Button openButton = (Button)this.findViewById(R.id.ubicomposer_openUserServiceButton);
        openButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				removeDialog(LOAD_FILE_DIALOG); // Force removal of old dialog to ensure file list is updated
				showDialog(LOAD_FILE_DIALOG);
			}} );
        
        Button newButton = (Button)this.findViewById(R.id.ubicomposer_createUserServiceButton);
        newButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				showDialog(NEW_USER_SERVICE_DIALOG);
			}} );
        
        Button editButton = (Button)this.findViewById(R.id.ubicomposer_editButton);
        editButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startEditing();
			}} );
        
        Button startButton = (Button)this.findViewById(R.id.ubicomposer_startButton);
        startButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startRunning();
			}} );
        Button stopButton = (Button)this.findViewById(R.id.ubicomposer_stopButton);
        stopButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				stopRunning();
			}} );
     	// Debug: stopButton.setText(android.provider.ContactsContract.Contacts.CONTENT_URI.toString());
    }
    

    //In an Activity
    private static final String FILE_EXTENSION = ".simplelanguage";    

    private String[] getAvailableUserServiceFiles(){
    	File fileDir = this.getFilesDir();
    	FilenameFilter filter = new FilenameFilter(){
    		public boolean accept(File dir, String filename){
    			return filename.endsWith(FILE_EXTENSION);
    		}
    	};
    	return fileDir.list(filter);
    }
    
    protected void createNewUserService(String fileName) {
    	if (!fileName.endsWith(FILE_EXTENSION)) {
    		fileName = fileName + FILE_EXTENSION;
    	}
    	
    	userService = ModelUtils.createModel(this, fileName);    
    	userService.setName(fileName.substring(0, fileName.lastIndexOf(FILE_EXTENSION)));
		
		UserServiceUtils.saveUserService(getFileStreamPath(fileName).getAbsolutePath(), userService);
		Toast.makeText(this, "User service " + fileName  + " was created", Toast.LENGTH_SHORT).show();
		setCurrentFileName(fileName);
    }
    
	private void openFile(String fileName) {
		@SuppressWarnings("unused")
		SimpleLanguagePackage pkg = SimpleLanguagePackage.eINSTANCE;
		@SuppressWarnings("unused")
		UbiCompDescriptorPackage pkg2 = UbiCompDescriptorPackage.eINSTANCE;

		userService = UserServiceUtils.loadUserService(getFileStreamPath(fileName).getAbsolutePath());
		setCurrentFileName(fileName);
		Toast.makeText(this, "User service " + fileName  + " was loaded", Toast.LENGTH_SHORT).show();	
/*		Intent taskListIntent = new Intent(this, TaskListActivity.class);
		taskListIntent.setData(Uri.fromFile(getFileStreamPath(fileName)));
		this.startActivity(taskListIntent);*/
	}	
	
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add("Load user service")
			.setIcon(android.R.drawable.ic_menu_add)
			.setOnMenuItemClickListener(new OnMenuItemClickListener() {
				@Override
				public boolean onMenuItemClick(MenuItem arg0) {
					removeDialog(LOAD_FILE_DIALOG); // Force removal of old dialog to ensure file list is updated
					showDialog(LOAD_FILE_DIALOG);
					return true;
				}});
		/*menu.add("Edit step")
			.setIcon(android.R.drawable.ic_menu_edit)
			.setIntent(new Intent(this, TaskListActivity.class));*/
		return true;
		
	}

    static final int LOAD_FILE_DIALOG = 1;
    static final int NEW_USER_SERVICE_DIALOG = 2;

	@Override
	protected Dialog onCreateDialog(int id) {
		switch(id) {
			case LOAD_FILE_DIALOG:
				return createOpenFileDialog();
			case NEW_USER_SERVICE_DIALOG:
				return createNewUserServiceDialog();
		}
		return super.onCreateDialog(id);
	}

	String[] fileNames;
	
	private Dialog createOpenFileDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Choose the user service to open:");
		fileNames = this.getAvailableUserServiceFiles();
		builder.setItems(fileNames, new DialogInterface.OnClickListener(){
		       public void onClick(DialogInterface dialog, int which){
		    	   openFile(fileNames[which]);
		       }
		      });
		return builder.create();
	}

	private Dialog createNewUserServiceDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		
		builder.setTitle("Please enter a name for the new user service");
		final EditText input = new EditText(this);
		builder.setView(input);
		builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
		
			@Override
			public void onClick(DialogInterface dialog, int which) {
				createNewUserService(input.getText().toString());
			}} );
		
		builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				
			}} ); 
		return builder.create();
	}

	
	// Runtime support
	
	private void startRunning() {
		// First, ensure that the runtime environment has registered what it needs
		RuntimeEnvironment env = RuntimeEnvironmentInstance.getRuntimeEnvironment();
		env.setUserService(userService);
		env.registerFactory(new CommunicationFactory()); // TODO: Find out how to avoid this hardcoding
		
		// Start the service by sending a startService intent
		Intent intent = new Intent(this, UserServiceExecutionService.class);
		startService(intent);
	}
	
	private void stopRunning() {
		RuntimeEnvironment env = RuntimeEnvironmentInstance.getRuntimeEnvironment();
		env.setActive(false);
	}
	
    protected void startEditing() {
    	if (fileName != null) {
    		Intent taskListIntent = new Intent(this, TaskListActivity.class);
    		taskListIntent.setData(Uri.fromFile(getFileStreamPath(fileName)));
    		this.startActivity(taskListIntent);
    	}
    	
    }
    
    protected void setCurrentFileName(String fileName) {
    	this.fileName = fileName;
    	TextView fileNameView = (TextView)this.findViewById(R.id.ubicomposer_serviceNameTextView);
    	fileNameView.setText("User service: " + fileName.substring(0, fileName.lastIndexOf(".")));
    }
}