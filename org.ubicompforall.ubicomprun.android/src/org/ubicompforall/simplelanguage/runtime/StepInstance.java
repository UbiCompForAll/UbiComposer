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
	 * This method is called every time an event is added to the list of events in Engine. 
	 * Every component override this method and this method will keep on going until it returns -1.
	 * The last component in the composition should keep its nextCid = -1. Otherwise, you'll get a RuntimeException.
	 * 
	 * @param context the TaskInstance this component is running in
	 * 
	 * @param parameters save useful information and that information can be used by other components 
	 * which is in the same composition.
	 * @return the nextCid, so the correct component will get executed by Engine.
	 */
	public int execute (TaskInstance context, Map<String, Object> parameters);
	
	public void setStep(Step step);
}
