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

import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.Condition;
import org.ubicompforall.simplelanguage.Step;
import org.ubicompforall.simplelanguage.Trigger;
import org.ubicompforall.simplelanguage.runtime.BuildingBlockFactory;
import org.ubicompforall.simplelanguage.runtime.BuildingBlockInstance;
import org.ubicompforall.simplelanguage.runtime.ConditionInstance;
import org.ubicompforall.simplelanguage.runtime.StepInstance;

public class MapBasedBuildingBlockFactory implements BuildingBlockFactory {

	Map<String, Class<? extends BuildingBlockInstance>> classMap = new HashMap<String,Class<? extends BuildingBlockInstance>>();
	
	
	public MapBasedBuildingBlockFactory(Map<String, Class<? extends BuildingBlockInstance>> classMap) {
		this.classMap = classMap;
	}
	
	
	@Override
	public BuildingBlockInstance createBuildingBlock(BuildingBlock buildingBlock) {
		Class<? extends BuildingBlockInstance> cls = classMap.get(buildingBlock.getDescriptor().getName());
		if (cls != null) {
			try {
				BuildingBlockInstance bb = (BuildingBlockInstance)cls.newInstance();
				bb.setBuildingBlock(buildingBlock);
				return bb;
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public StepInstance createStep(Step step) {
		BuildingBlockInstance bb = createBuildingBlock(step);
		if (bb != null)
			return (StepInstance)bb;
		else
			return null;
	}

	@Override
	public ConditionInstance createCondition(Condition condition) {
		BuildingBlockInstance bb = createBuildingBlock(condition);
		if (bb != null)
			return (ConditionInstance)bb;
		else
			return null;
	}

	@Override
	public TriggerMonitor createTriggerMonitor(Trigger trigger) {
		BuildingBlockInstance bb = createBuildingBlock(trigger);
		if (bb != null)
			return (TriggerMonitor)bb;
		else
			return null;
	}
	
}
