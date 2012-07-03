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
package org.ubicompforall.simplelanguage.runtime;

import java.util.HashMap;
import java.util.Map;

import org.ubicompforall.simplelanguage.Task;
import org.ubicompforall.simplelanguage.UserService;

public class RuntimeEnvironment implements TaskTrigger {
	UserService userService;
	private boolean active;
	
	Map<String, TriggerMonitor> monitoredTasks = new HashMap<String, TriggerMonitor>();
	
	CompositeBuildingBlockFactory factory;
	
	public RuntimeEnvironment() {	
		factory = createCompositeFactory();
	}
	
	public RuntimeEnvironment(UserService userService) {
		this.userService = userService;
		factory = createCompositeFactory();
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public UserService getUserService() {
		return userService;
	}
	
	public void registerFactory(BuildingBlockFactory factory) {
		this.factory.addFactory(factory);
	}

	public BuildingBlockFactory getBuildingBlockFactory() {
		return factory;
	}
	
	public void startMonitoringTask(Task task) {
		if (task.getTrigger() == null) {
			//TODO: Add warning message
			return;
		}
		TriggerMonitor monitor = factory.createTriggerMonitor(task.getTrigger().getDescriptor().getName());
		if (monitor != null) {
			monitoredTasks.put(task.getName(), monitor);
			monitor.startMonitoring(task, this);
		}
	}
	
	public void startMonitoringTasks() {
		if (userService == null)
			return;

		// First, stop any existing monitors
		// TODO: optimize this later
		stopMonitoringTasks();

		for (Task task : userService.getTasks()) {
			if (task.isActive()) {
				startMonitoringTask(task);
			}
		}
	}

	public void stopMonitoringTasks() {
		for (TriggerMonitor trigger : monitoredTasks.values()) {
			trigger.stopMonitoring();
		}
		monitoredTasks.clear();
	}
		
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public void invokeTask(final Task task, final Map<String, Object> withParameters) {
		// Invoke the execution of the task in a separate thread, as it can take some time
		Thread thread = new Thread(		
			new Runnable() {

				@Override
				public void run() {
					try {
						TaskInstance taskInst = new TaskInstance(RuntimeEnvironment.this);
						taskInst.perform(task, withParameters);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
				}
			
			}
		);
		thread.start();
		
	}
	
	protected CompositeBuildingBlockFactory createCompositeFactory() {
		return new CompositeBuildingBlockFactory();		
	}
}
