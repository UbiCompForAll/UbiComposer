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

import org.ubicompforall.simplelanguage.PropertyAssignment;
import org.ubicompforall.simplelanguage.PropertyReference;
import org.ubicompforall.simplelanguage.Step;

public abstract class AbstractStepInstance implements StepInstance {

	Step step;
	Map<String, Object> propValues = null;
	
	@Override
	public void setStep(Step step) {
		this.step = step;
	}
	
	
	private void createInstancePropValuesMap(Map<String, Object> parameters) {
		if (propValues == null) {
			propValues = new HashMap<String, Object>();
			for (PropertyAssignment prop : step.getPropertyValues()) {
				if (prop instanceof PropertyReference) {
					PropertyReference ref = (PropertyReference)prop;
					Object val = parameters.get(ref.getFromObject().getName() + "." + ref.getFromProperty());
					if (val != null)
						propValues.put(ref.getProperty(), val);
				} else {
					propValues.put(prop.getProperty(), prop.getValue());
				}
			}
		}		
	}
	
	
	public Object getPropertyValue(String propertyName, Map<String, Object> parameters) {
		if (propValues == null) {
			createInstancePropValuesMap(parameters);
		}	
		return propValues.get(propertyName);
	}
	
	public void setPropertyValue(String propertyName, Object value, Map<String, Object> parameters) {
		parameters.put(step.getName() + "." + propertyName, value);
	}
	
	public String getStringValue(String propertyName, Map<String, Object> parameters) {
		return (String)getPropertyValue(propertyName, parameters);
	}
	
	

}
