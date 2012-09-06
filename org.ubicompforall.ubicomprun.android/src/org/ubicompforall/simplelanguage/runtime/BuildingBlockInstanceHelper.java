package org.ubicompforall.simplelanguage.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.DomainObjectAssignment;
import org.ubicompforall.simplelanguage.DomainObjectReference;
import org.ubicompforall.simplelanguage.PropertyAssignment;
import org.ubicompforall.simplelanguage.PropertyReference;

/**
 * Helper class that manages property values for a BuildingBlockInstance.
 * Provides getter and setter methods for properties, including support
 * for property references and domain object references.
 * @author erlend
 *
 */
public class BuildingBlockInstanceHelper {
	private BuildingBlock buildingBlock;	
	private Map<String, Object> propValues = new HashMap<String, Object>();
	private Map<String, EList<DomainObjectReference>> domainObjects = new HashMap<String, EList<DomainObjectReference>>();

	/**
	 * Creates a new helper object and sets up the initial property map of
	 * the helper based on the properties assigned in the building block
	 * @param block
	 */
	public BuildingBlockInstanceHelper(BuildingBlock block) {
		this.buildingBlock = block;
		setupInitialPropertyMap();
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
	 * Sets up the internal property map based on the parameter map
	 * and the values of the step
	 */
	protected void setupInitialPropertyMap() {
		for (PropertyAssignment prop : buildingBlock.getPropertyValues()) {
			if (prop instanceof DomainObjectAssignment) {
				domainObjects.put(prop.getProperty(), ((DomainObjectAssignment)prop).getDomainObject());
			}
			else if (!(prop instanceof PropertyReference)) {
				propValues.put(prop.getProperty(), prop.getValue());
			}
		}	
	}

	/**
	 * Updates the building block property map by retrieving any references to
	 * properties of other building blocks found in the task parameter map. Typically 
	 * called by steps and queries in the start of their execute() method
	 * @param taskParameterMap The map of parameters with properties from building blocks
	 * that have already completed their execution during this task instance
	 */
	public void resolvePropertyReferences(Map<String, Object> taskParameterMap) {
		for (PropertyAssignment prop : buildingBlock.getPropertyValues()) {
			if (prop instanceof PropertyReference) {
				PropertyReference ref = (PropertyReference)prop;
				Object val = taskParameterMap.get(ref.getFromObject().getName() + "." + ref.getFromProperty());
				if (val != null)
					setPropertyValue(ref.getProperty(), val);
			}
		}	
	}	
	
	/**
	 * Updates the task parameter map by adding the properties defined by this
	 * building block. This method should typically be called at the end of the
	 * execute method of steps and queries to make the results of these building
	 * blocks available for building blocks called later in task execution.
	 * @param taskParameterMap
	 */	
	public void updateTaskParameterMap(Map<String, Object> taskParameterMap) {
		// Copy all properties of this step back to the task parameter map, prefixing the 
		// parameter name with the name of the building block
		for (Entry<String, Object> entry : propValues.entrySet()) {
			taskParameterMap.put(buildingBlock.getName() + "." + entry.getKey(), entry.getValue());			 
		}		
	}
	
	/**
	 * Creates a task parameter map based containing the properties of this
	 * building block. This method is used by trigger monitors to create 
	 * the task parameter map right before (or in) the call to the task invoker.
	 * @return Parameter map initialized with the properties of the building block
	 */
	public Map<String, Object> createTaskParameterMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		updateTaskParameterMap(map);
		return map;
	}
	
	public BuildingBlock getBuildingBlock() {
		return buildingBlock;
	}

}
