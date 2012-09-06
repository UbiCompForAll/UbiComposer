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

import org.ubicompforall.simplelanguage.Condition;
import org.ubicompforall.simplelanguage.ConditionalStep;
import org.ubicompforall.simplelanguage.InformationObject;
import org.ubicompforall.simplelanguage.Query;
import org.ubicompforall.simplelanguage.Step;
import org.ubicompforall.simplelanguage.Task;
import org.ubicompforall.simplelanguage.Trigger;

public class TaskInstance {
	
	RuntimeEnvironment environment;
	Map<String, Object> parameters = null;
	
	public TaskInstance(RuntimeEnvironment environment) {
		this.environment = environment;
	}
	
	
	
	public void perform(Task task, Map<String, Object> parameters) {
		this.parameters = parameters;
		Trigger trigger = task.getTrigger();		
		
		// First, check that all conditions are true
		for (Condition cond : trigger.getConditions()) {
			if (!checkCondition(cond)) {
				return;
			}
			
		}
		
		// Next, if the conditions are fulfilled, determine the order to perform the queries in
		
		// Find the queries
/*		List<Query> queries = new ArrayList<Query>();
		for (int q = 0; q < this.infoObjects.size(); q++) {
			
			if (infoObjects.get(q) instanceof Query)  {
				// consider this one
				queries.add((Query) infoObjects.get(q));
			}				
		}
		
		List<Query> orderedQueries = new ArrayList<Query>();
		while (!queries.isEmpty()) {
			boolean queryFound = false;
			for (int a = 0; a < queries.size(); a++) {
				// Find first query with no dependencies that are not already in orderedQueries
				Query crQuery = queries.get(a);
				crQuery.getPropertyValues();
				
				// TODO: Add code to retrieve PropertyReferences, and then retrieve the set of dependencies from these
				
				// Retrieve only the PropertyReferences
				List<PropertyReference> refs = null;		
				
				refs.get(0).getFromObject();
				Set dependencies = null;
				if (orderedQueries.containsAll(dependencies)) {
					// Add this query to the orderedQueries and remove from queries
					orderedQueries.add(crQuery);
					queries.remove(crQuery);
					queryFound = true;
					break;
					// Continue back to while
				}				
				
			}
			if (!queries.isEmpty() && !queryFound) {
			  // TODO: There is a circular dependency, so log or throw error
			  break;	
			}			
		}
		*/
		
		// Initial simplification - perform all queries in sequence
		for (InformationObject info : task.getInfoObjects()) {
			if (info instanceof Query) {
				performQuery((Query)info);
			}
		}
		
		// Finally, perform the steps			
		for (Step step : task.getStepSequence()) {
			performStep(step);
		}
	
	}
	
	
	
	protected void performQuery(Query query) {
		StepInstance inst = environment.getBuildingBlockFactory().createStep(query);
		if (inst != null) {
			inst.execute(this, parameters);
		}
		else {
			// Report missing class			
		}
	}
	
	protected void performStep(Step step) {
		StepInstance inst = environment.getBuildingBlockFactory().createStep(step);
		if (inst != null) {
			inst.setStep(step);
			inst.execute(this, parameters);
		}
		else {
			// Report missing class			
		}		
	}
	
	protected void performConditionalStep(ConditionalStep step) {		
		// First, check that all conditions are true
		for (Condition cond : step.getConditions()) {
			if (!checkCondition(cond)) {
				return;
			}
			
		}
		
		// If the conditions were true, perform the step sequence contained			
		for (Step containedStep : step.getStepSequence()) {
			performStep(containedStep);
		}		
	}
	
	
	protected boolean checkCondition(Condition condition) {
		ConditionInstance inst = environment.getBuildingBlockFactory().createCondition(condition);
		if (inst != null) {
			inst.setCondition(condition);
			return inst.check(this, parameters);
		}
		else {
			return false;
			// Report missing class			
		}		
	}
	
}
