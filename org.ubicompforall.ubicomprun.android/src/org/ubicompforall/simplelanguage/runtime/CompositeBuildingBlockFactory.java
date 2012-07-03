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

import java.util.ArrayList;
import java.util.List;

public class CompositeBuildingBlockFactory implements BuildingBlockFactory {
	protected List<BuildingBlockFactory> factories = new ArrayList<BuildingBlockFactory>();

	public CompositeBuildingBlockFactory() {		
	}
	
	public void addFactory(BuildingBlockFactory factory) {
		factories.add(factory);		
	}	
	
	@Override
	public BuildingBlockInstance createBuildingBlock(String buildingBlockName) {
		for (BuildingBlockFactory factory : factories) {
			BuildingBlockInstance instance = factory.createBuildingBlock(buildingBlockName);
			if (instance != null) {
				return instance;
			}			
		}
		return null;
	}

	@Override
	public StepInstance createStep(String stepName) {
		for (BuildingBlockFactory factory : factories) {
			StepInstance instance = factory.createStep(stepName);
			if (instance != null) {
				return instance;
			}			
		}
		return null;
	}

	@Override
	public ConditionInstance createCondition(String condition) {
		for (BuildingBlockFactory factory : factories) {
			ConditionInstance instance = factory.createCondition(condition);
			if (instance != null) {
				return instance;
			}			
		}
		return null;
	}
	
	@Override
	public TriggerMonitor createTriggerMonitor(String triggerName) {
		for (BuildingBlockFactory factory : factories) {
			TriggerMonitor instance = factory.createTriggerMonitor(triggerName);
			if (instance != null) {
				return instance;
			}			
		}
		return null;
	}
	

}
