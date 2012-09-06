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

import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.Condition;
import org.ubicompforall.simplelanguage.Step;
import org.ubicompforall.simplelanguage.Trigger;

public interface BuildingBlockFactory {

	/**
	 * Create an instance of a building block based on the descriptor provided.
	 * The new building block will be initialized with a call to setBuildingBlock
	 * before the instance is returned from the factory. 
	 * @param buildingBlock
	 * @return The new building block instance, with its buildingBlock property set
	 */
	public BuildingBlockInstance createBuildingBlock(BuildingBlock buildingBlock);
	
	public StepInstance createStep(Step step);
	
	public ConditionInstance createCondition(Condition condition);
	
	public TriggerMonitor createTriggerMonitor(Trigger trigger);

}
