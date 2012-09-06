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
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.ubicompforall.simplelanguage.DomainObjectAssignment;
import org.ubicompforall.simplelanguage.DomainObjectReference;
import org.ubicompforall.simplelanguage.PropertyAssignment;
import org.ubicompforall.simplelanguage.PropertyReference;
import org.ubicompforall.simplelanguage.Step;

public abstract class AbstractStepInstance implements StepInstance {

	Step step;
	Map<String, Object> propValues = new HashMap<String, Object>() ;
	Map<String, EList<DomainObjectReference>> domainObjects = new HashMap<String, EList<DomainObjectReference>>();
	Map<String, Object> taskParameterMap = new HashMap<String, Object>();
	
	TaskInstance taskInstance;
	
	@Override
	public void setStep(Step step) {
		this.step = step;
	}
	
	
	/**
	 * Override to perform the logic of the step. For each result value or
	 * changes of property value from the step, the setPropertyValue method
	 * should be called from within execute() to make the updates.
	 */
	public abstract void execute();

	
	public TaskInstance getTaskInstance() {
		return taskInstance;
	}
	
	public Object getPropertyValue(String propertyName) {
		return propValues.get(propertyName);
	}

	public String getStringPropertyValue(String propertyName) {
		return (String)propValues.get(propertyName);
	}
	
	public DomainObjectReference getDomainObjectReference(String propertyName) {
		EList<DomainObjectReference> list = domainObjects.get(propertyName);
		if ((list != null) && (list.size() > 0)) {
			return list.get(0);
		}
		else
			return null;
	}

	public EList<DomainObjectReference> getDomainObjectReferences(String propertyName) {
		return domainObjects.get(propertyName);
	}
	
	public void setPropertyValue(String propertyName, Object value) {
		propValues.put(propertyName, value);
	}
	
	/**
	 * Implements the execute method of the interface and handles the setup of the 
	 * internal property map before calling the abstract parameterless execute() method.
	 * Any updates to property values will be reflected back to the parameters map
	 * after the abstract execute() has returned.
	 */
	public int execute(TaskInstance context, Map<String, Object> parameters) {
		taskInstance = context;
		taskParameterMap = parameters;
		setupInternalPropertyMap();
		execute();
		updateTaskParameterMap();
		return 0;
	}

	/**
	 * Internal method for setting up the internal property map based on the parameter map
	 * and the values of the step
	 */
	protected void setupInternalPropertyMap() {
		for (PropertyAssignment prop : step.getPropertyValues()) {
			if (prop instanceof PropertyReference) {
				PropertyReference ref = (PropertyReference)prop;
				Object val = taskParameterMap.get(ref.getFromObject().getName() + "." + ref.getFromProperty());
				if (val != null)
					setPropertyValue(ref.getProperty(), val);
			} else if (prop instanceof DomainObjectAssignment) {
				domainObjects.put(prop.getProperty(), ((DomainObjectAssignment)prop).getDomainObject());
			}
			else {
				propValues.put(prop.getProperty(), prop.getValue());
			}
		}	
	}	
	
	protected void updateTaskParameterMap() {
		// Copy all properties of this step back to the task parameter map, prefixing the 
		// parameter name with the name of the building block
		for (Entry<String, Object> entry : propValues.entrySet()) {
			taskParameterMap.put(step.getName() + "." + entry.getKey(), entry.getValue());			 
		}		
	}
	
/*
	private void createInstancePropValuesMap(Map<String, Object> parameters) {
		if (propValues == null) {
			propValues = new HashMap<String, Object>();
			domainObjects = new HashMap<String, DomainObjectReference>();
			for (PropertyAssignment prop : step.getPropertyValues()) {
				if (prop instanceof PropertyReference) {
					PropertyReference ref = (PropertyReference)prop;
					Object val = parameters.get(ref.getFromObject().getName() + "." + ref.getFromProperty());
					if (val != null)
						propValues.put(ref.getProperty(), val);
				} else if (prop instanceof DomainObjectAssignment) {
					domainObjects.put(prop.getProperty(), ((DomainObjectAssignment)prop).getDomainObject();
				}
				else {
					propValues.put(prop.getProperty(), prop.getValue());
				}
			}
		}		
	}
*/	
	
/*
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
*/	

}
