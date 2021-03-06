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

import java.util.Map;

import org.ubicompforall.simplelanguage.Step;

public abstract class AbstractStepInstance extends AbstractBuildingBlockInstance implements StepInstance {

	TaskInstance taskInstance;
	
	/**
	 * Override to perform the logic of the step. For each result value or
	 * changes of property value from the step, the setPropertyValue method
	 * should be called from within execute() to make the updates.
	 */
	public abstract void execute();

	public Step getStep() {
		return (Step)getBuildingBlock();
	}
	
	public TaskInstance getTaskInstance() {
		return taskInstance;
	}
	
	/**
	 * Implements the execute method of the interface and handles the setup of the 
	 * internal property map before calling the abstract parameterless execute() method.
	 * Any updates to property values will be reflected back to the parameters map
	 * after the abstract execute() has returned.
	 */
	public int execute(TaskInstance context, Map<String, Object> parameters) {
		taskInstance = context;
		this.resolvePropertyReferences(parameters);
		execute();
		this.updateTaskParameterMap(parameters);
		return 0;
	}
	
}
