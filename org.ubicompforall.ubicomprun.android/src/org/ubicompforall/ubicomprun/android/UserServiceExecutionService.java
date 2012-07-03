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
package org.ubicompforall.ubicomprun.android;

import org.ubicompforall.simplelanguage.runtime.android.AndroidRuntimeEnvironment;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Main service that keeps the runtime system up and running until stopped
 * @author erlend
 *
 */
public class UserServiceExecutionService extends IntentService {
	
	public UserServiceExecutionService() {
		super("UserServiceExecutionService");
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		AndroidRuntimeEnvironment env = RuntimeEnvironmentInstance.getRuntimeEnvironment();
		env.setContext(this);
		
		Toast.makeText(this, "Started running user defined services", Toast.LENGTH_SHORT);
		env.setActive(true);
		env.startMonitoringTasks();
		
		while (env.isActive()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Toast.makeText(this, "Stopped running user defined services", Toast.LENGTH_SHORT);
			
			}
		}
		env.stopMonitoringTasks();
	}
		

}
