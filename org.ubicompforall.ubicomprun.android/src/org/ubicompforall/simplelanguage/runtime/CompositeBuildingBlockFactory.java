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

import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.Condition;
import org.ubicompforall.simplelanguage.Step;
import org.ubicompforall.simplelanguage.Trigger;

import android.util.Log;

public class CompositeBuildingBlockFactory implements BuildingBlockFactory {
	protected List<BuildingBlockFactory> factories = new ArrayList<BuildingBlockFactory>();

	public CompositeBuildingBlockFactory() {		
	}
	
	public void addFactory(BuildingBlockFactory factory) {
		factories.add(factory);		
	}	
	
	@Override
	public BuildingBlockInstance createBuildingBlock(BuildingBlock buildingBlock) {
		for (BuildingBlockFactory factory : factories) {
			BuildingBlockInstance instance = factory.createBuildingBlock(buildingBlock);
			if (instance != null) {
				return instance;
			}			
		}
		Log.e("CompositeBuildingBlockFactory", "No factory found any class for a building block named "+buildingBlock.getDescriptor().getName() + 
				". Please check the registration of your building blocks in the factories.");
		return null;
	}

	@Override
	public StepInstance createStep(Step step) {
		for (BuildingBlockFactory factory : factories) {
			StepInstance instance = factory.createStep(step);
			if (instance != null) {
				return instance;
			}			
		}
		return null;
	}

	@Override
	public ConditionInstance createCondition(Condition condition) {
		for (BuildingBlockFactory factory : factories) {
			ConditionInstance instance = factory.createCondition(condition);
			if (instance != null) {
				return instance;
			}			
		}
		return null;
	}
	
	@Override
	public TriggerMonitor createTriggerMonitor(Trigger trigger) {
		for (BuildingBlockFactory factory : factories) {
			TriggerMonitor instance = factory.createTriggerMonitor(trigger);
			if (instance != null) {
				return instance;
			}			
		}
		return null;
	}
	

}
