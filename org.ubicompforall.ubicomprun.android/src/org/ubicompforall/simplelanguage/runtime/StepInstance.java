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

public interface StepInstance extends BuildingBlockInstance {

	/**
	 * This method is called when it is time to execute a step.
	 *  
	 * @param context The TaskInstance this component is running in
	 * 
	 * @param parameters Contains a map of property values of building blocks have already been performed,
	 * with componentName.propertyName as key and the value as a string.
	 * Each building block is responsible for adding its own property values to the map as part
	 * of this method.
	 * @return Currently not in use.
	 */
	public int execute (TaskInstance context, Map<String, Object> parameters);
}
