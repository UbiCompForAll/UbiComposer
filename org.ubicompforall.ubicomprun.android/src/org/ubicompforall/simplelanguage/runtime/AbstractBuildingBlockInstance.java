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

import org.eclipse.emf.common.util.EList;
import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.DomainObjectReference;

public class AbstractBuildingBlockInstance implements BuildingBlockInstance {

	private BuildingBlock buildingBlock;	
	private BuildingBlockInstanceHelper helper;
	
	public AbstractBuildingBlockInstance() {
		super();
	}

	public Object getPropertyValue(String propertyName) {
		return helper.getPropertyValue(propertyName);
	}

	public String getStringPropertyValue(String propertyName) {
		return helper.getStringPropertyValue(propertyName);
	}

	public DomainObjectReference getDomainObjectReference(String propertyName) {
		return helper.getDomainObjectReference(propertyName);
	}

	public EList<DomainObjectReference> getDomainObjectReferences(String propertyName) {
		return helper.getDomainObjectReferences(propertyName);
	}

	public void setPropertyValue(String propertyName, Object value) {
		helper.setPropertyValue(propertyName, value);
	}

	/**
	 * Updates the task parameter map by adding the properties defined by this
	 * building block. This method should typically be called at the end of the
	 * execute method of steps and queries to make the results of these building
	 * blocks available for building blocks called later in task execution.
	 * @param taskParameterMap
	 */	
	protected void updateTaskParameterMap(Map<String, Object> taskParameterMap) {
		helper.updateTaskParameterMap(taskParameterMap);
	}

	/**
	 * Updates the building block property map by retrieving any references to
	 * properties of other building blocks found in the task parameter map. 
	 * @param taskParameterMap The map of parameters with properties from building blocks
	 * that have already completed their execution during this task instance
	 */
	protected void resolvePropertyReferences(Map<String, Object> taskParameterMap) {
		helper.resolvePropertyReferences(taskParameterMap);
	}
	
	/**
	 * Creates a task parameter map based containing the properties of this
	 * building block. This method is used by trigger monitors to create 
	 * the task parameter map right before (or in) the call to the task invoker.
	 * @return Parameter map initialized with the properties of the building block
	 */
	protected Map<String, Object> createTaskParameterMap() {
		return helper.createTaskParameterMap();
	}	
	
	/**
	 * Get the BuildingBlock from the composition for which this
	 * BuildingBlockInstance is an instance
	 * @return The BuildingBlock
	 */
	public BuildingBlock getBuildingBlock() {
		return buildingBlock;
	}
	
	// ******** Implementation of methods of BuildingBlockInstance interface *********
	
	@Override
	public void setBuildingBlock(BuildingBlock buildingBlock) {
		this.buildingBlock = buildingBlock;		
		helper = new BuildingBlockInstanceHelper(buildingBlock);
	}
	

}