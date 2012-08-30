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
package org.ubicompforall.ubicomposer.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.ubicompforall.descriptor.BuildingBlockDesc;
import org.ubicompforall.descriptor.DomainObjectDesc;
import org.ubicompforall.descriptor.Property;
import org.ubicompforall.descriptor.TriggerDesc;
import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.DomainObjectReference;
import org.ubicompforall.simplelanguage.InformationObject;
import org.ubicompforall.simplelanguage.PropertyAssignment;
import org.ubicompforall.simplelanguage.PropertyReference;
import org.ubicompforall.simplelanguage.SimpleLanguageFactory;
import org.ubicompforall.simplelanguage.Step;
import org.ubicompforall.simplelanguage.Task;
import org.ubicompforall.simplelanguage.DomainObjectAssignment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Abstract class for UbiComposer editor activities for editing
 * details of a building block.
 * This class supports editing of properties of building blocks, 
 * including editing of references to properties of other bilding blocks
 *  
 * @author erlend
 *
 */
public abstract class AbstractEditBuildingBlockActivity extends AbstractUbiComposerActivity {
	private BuildingBlock buildingBlock;
	private LinearLayout buildingBlockView;
	
	/**
	 * Get the view to which building blocks will be added
	 * @return The building block view
	 */
	protected LinearLayout getBuildingBlockView() {
		return buildingBlockView;
	}

	/**
	 * Set the view to which building blocks will be added
	 * @param buildingBlockView The view to use as the building block view
	 */
	protected void setBuildingBlockView(LinearLayout buildingBlockView) {
		this.buildingBlockView = buildingBlockView;
	}

	/**
	 * Get the building block being edited by this activity
	 * @return The building block
	 */
	protected BuildingBlock getBuildingBlock() {
		return buildingBlock;
	}

	/**
	 * Set the building block to edit in this activity
	 * @param buildingBlock The building block to edit
	 */
	protected void setBuildingBlock(BuildingBlock buildingBlock) {
		this.buildingBlock = buildingBlock;
	}
	
	/**
	 * Creates editors for all properties (except return values) of the building block 
	 * by checking the type of each property and delegating the
	 * creation process to create... methods for the correct type.
	 */
    protected void createEditorsForProperties() {		
		BuildingBlockDesc descr = getBuildingBlock().getDescriptor();

		// Go through all the properties, and create a widget for displaying and editing each of them
		for (Property prop : descr.getProperties()) {
			if (prop.isIsResultValue())
				return; // Do not create editor for result values
			
			if (prop.getDataType().getName().equalsIgnoreCase("String")) {
				createStringField(prop);
			} else if (prop.getDataType().getName().equalsIgnoreCase("Boolean")) {
				createBooleanField(prop);
			} else if (prop.getDataType().getName().equalsIgnoreCase("Integer")) {
				createIntegerField(prop);
			} else if (prop.getDataType().getName().equalsIgnoreCase("Float")) {
				createFloatField(prop);
			} else if (prop.getDataType().getName().equalsIgnoreCase("Date")) {
				createDateField(prop);
			} else if (prop.getDataType() instanceof DomainObjectDesc) {
				createDomainReferenceField(prop);
			}
			else {
				createStringField(prop);
			}
		}   	
    }	

	/**
	 * Creates a visual list of all properties that are return values of the building block,
	 * using the provided label as a header.
	 * @param label The text to use as a header for the list
	 */
    protected void createListOfReturnValues(String label) {
    	// First add the header
		TextView headerLabel = new TextView(this);
		headerLabel.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		headerLabel.setText(label);
		buildingBlockView.addView(headerLabel);

		// Next, create a layout to contain the list of result properties
		LinearLayout ll = new LinearLayout(this);
		BuildingBlockDesc descr = getBuildingBlock().getDescriptor();
		
		boolean hasNone = true;
		
		// Go through the list and add labels for each property that is a result value
		for (Property prop : descr.getProperties()) {
			if (prop.isIsResultValue()) {
				TextView resultLabel = new TextView(this);
				resultLabel.setText(prop.getUserFriendlyName());
				ll.addView(resultLabel);
				hasNone = false;
			}
		}
		if (hasNone) {
			TextView resultLabel = new TextView(this);
			resultLabel.setText("None available");
			ll.addView(resultLabel);
		}
		buildingBlockView.addView(ll);	
    }
    
    
    /**
     * Create an editor for the specified integer property and add it to the building block view
     * @param prop The property to add an editor for
     */
    protected void createIntegerField(Property prop) {
		createStringField(prop, InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);		
	}

    /**
     * Create an editor for the specified float property and add it to the building block view
     * @param prop The property to add an editor for
     */
	protected void createFloatField(Property prop) {
		createStringField(prop, InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);		
	}

    /**
     * Create an editor for the specified date property and add it to the building block view
     * @param prop The property to add an editor for
     */
	protected void createDateField(Property prop) {
		createStringField(prop, InputType.TYPE_CLASS_DATETIME | InputType.TYPE_DATETIME_VARIATION_DATE);				
	}

    /**
     * Create an editor for the specified string property and add it to the building block view
     * @param prop The property to add an editor for
     */
	protected void createStringField(Property prop) {
		createStringField(prop, InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
	}

	/**
	 * Create editor for a string-based property, specifying the input type for the property.
	 * The editor is added to the building block view.
	 * @param prop The property to create an editor for
	 * @param inputType An input type as specified in android.text.InputType 
	 */
	protected void createStringField(final Property prop, int inputType) {
		TextView fieldNameLabel = new TextView(this);
		fieldNameLabel.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		fieldNameLabel.setText(prop.getUserFriendlyName());
		buildingBlockView.addView(fieldNameLabel);
	
		EditText editText = new EditText(this);
		editText.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		editText.setHint(prop.getDescription());
		editText.setInputType(inputType);
		
		ImageButton button = new ImageButton(this);
		button.setImageResource(R.drawable.link_add_icon);
		button.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		button.setOnClickListener(new ImageButton.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (bindings.get(prop.getName()).isEnabled()) {
					// If the text was enabled, proceed to show dialog and select property reference
					setCurrentDialogProperty(prop);
					showDialog(SELECT_PROPERTY_REF);
				}
				else {
					// If the text was not enabled, there is an existing property reference. Remove
					// the old reference, and update the view.
					updatePropertyWithValue(prop, null);
					updateViewFromProperty(prop);
				}
			}});
		
		LinearLayout ll = new LinearLayout(this);
		ll.addView(button);
		ll.addView(editText);
		buildingBlockView.addView(ll);
		
		bind(prop, editText, button);
	}

    /**
     * Create an editor for the specified boolean property and add it to the building block view
     * @param prop The property to add an editor for
     */
	protected void createBooleanField(Property prop) {
		CheckBox checkBox = new CheckBox(this);
		checkBox.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		checkBox.setText(prop.getUserFriendlyName());
		checkBox.setHint(prop.getDescription());
		//PropertyAssignment assign = getPropertyOfBlock(buildingBlock, prop.getName());
		//if (assign != null) {
			// Create binding between the widget and the value of the assignment
		//	checkBox.setChecked(Boolean.getBoolean(assign.getValue()));
		//} 
		buildingBlockView.addView(checkBox);		
		bind(prop, checkBox);
	}

	

    /**
     * Create an editor for a the specified domain reference property and add it to the building block view
     * @param prop The property to add an editor for
     */
	protected void createDomainReferenceField(Property prop) {
		TextView fieldNameLabel = new TextView(this);
		fieldNameLabel.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		fieldNameLabel.setText(prop.getUserFriendlyName());
		buildingBlockView.addView(fieldNameLabel);

		// Create a spinner to use for selecting the reference
		Spinner spinner = new Spinner(this);
		spinner.setTag(prop);
		spinner.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
	
		// Add a listener that sets the domain object assignment
		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {
				Cursor curs = (Cursor)parent.getItemAtPosition(pos);				
				setDomainObjectAssignment((Property)parent.getTag(),curs.getString(0), curs.getString(1) );				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				removeOldAssignment((Property)parent.getTag());
			}
		});
		
		buildingBlockView.addView(spinner);		
		bind(prop, spinner);
	}
	
	
	Map<String, EditText> bindings = new HashMap<String, EditText>();
	Map<String, CheckBox> boolBindings = new HashMap<String, CheckBox>();
	Map<String, ImageButton> buttonBindings = new HashMap<String, ImageButton>();
	Map<String, Spinner> listBindings = new HashMap<String, Spinner>();
	
	/**
	 * Add a binding for the specified property to the edit field and the button.
	 * The bindings are used to keep the status of the property in synch with
	 * the field and button. 
	 * @param prop The property to add a binding for
	 * @param field The text field to add a binding for
	 * @param button The button to add a binding for
	 */
	protected void bind(Property prop, EditText field, ImageButton button) {
		bindings.put(prop.getName(), field);		
		buttonBindings.put(prop.getName(), button);
	}

	/**
	 * Add a binding for the specified property to the check box.
	 * The bindings are used to keep the status of the property in synch with
	 * the check box. 
	 * @param prop The property to add a binding for
	 * @param checkBox The check box to add a binding for
	 */
	protected void bind(Property prop, CheckBox checkBox) {
		boolBindings.put(prop.getName(), checkBox);		
	}

	/**
	 * Add a binding for the specified property to the check box.
	 * The bindings are used to keep the status of the property in synch with
	 * the check box. 
	 * @param prop The property to add a binding for
	 * @param checkBox The check box to add a binding for
	 */
	protected void bind(Property prop, Spinner spinner) {
		listBindings.put(prop.getName(), spinner);		
	}
		
	/**
	 * Trims the input string and returns either a the trimmed string or null if the string was empty or null
	 * @param theString The input string
	 * @return null if the input is null or an empty string, otherwise the trimmed string
	 */
	protected String stringOrNull(String theString) {
		if (theString == null)
			return null;
		else
			theString = theString.trim();
			return theString.equals("") ? null : theString.trim();
	}
	
	String SPLIT_STR = "[,\\. ]";
	
	/**
	 * Makes a query to a content provider to retrieve domain objects based
	 * on the provided domain domain object descriptor. The contentURI,
	 * projection, selection, selectionArgs and sortOrder of the descriptor
	 * will be passed to the query, replacing any empty strings with null
	 * in the request.  
	 * @param domDesc The domain object descriptor
	 * @return The cursor that can be used to access the query results 
	 */
	protected Cursor queryForDomainObjects(DomainObjectDesc domDesc) {
		String selArgs[] = null;
		if (!domDesc.getSelectionArgs().equals("")) {
			selArgs = domDesc.getSelectionArgs().split(SPLIT_STR);
		}
		
		String projectionStr = stringOrNull(domDesc.getProjection());
		String projection[] = null;
		if ((projectionStr != null) && (!projectionStr.equals("*"))) {
			projection = domDesc.getProjection().split(SPLIT_STR);
		}
		
		String selection = stringOrNull(domDesc.getSelection());
		if ((selection != null) && selection.equals("*"))
			selection = null;
		
		Cursor mCursor = getContentResolver().query(
				Uri.parse(domDesc.getContentURI()),   
			    projection,                        
			    selection,                    
			    selArgs,                     
			    stringOrNull(domDesc.getSortOrder()));
		return mCursor;
	}
	

	/**
	 * Helper class used for selecting which part of the data to display
	 * in the spinner view.
	 * @author erlend
	 *
	 */
	public class DomainDataBinder implements SimpleCursorAdapter.ViewBinder {
		@Override
		public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
			// Combine all columns after the ID (col 0) into a display string
			// with space between
			String displayStr = "";
			for (int i = 1; i < cursor.getColumnCount(); i++) {
				if (i > 1)
					displayStr = displayStr + " ";
				displayStr = displayStr + cursor.getString(columnIndex);
			}
			((TextView) view).setText(displayStr);
			return true;
		}

	}

	/**
	 * Updates a view presenting a property that has a domain object reference
	 * as type. The method updates the spinner view by querying the available
	 * domain objects that can be selected, and sets the selection of the 
	 * spinner to the currently assigned domain object (if any) 
	 * @param prop The property to update the view of
	 * @param assign The current assignment of domain object to the property
	 */
	protected void updateDomainObjectReferenceViewFromProperty(Property prop, PropertyAssignment assign) {

		try {
			// First, get the descriptor for the domain objects, and query for the available objects to select from
			DomainObjectDesc domDesc = (DomainObjectDesc)prop.getDataType();
			Cursor mCursor = queryForDomainObjects(domDesc);

			int selectedPosition = 0;
			boolean foundSelected = false;
			if (assign != null) {
				// Locate the current selection
				DomainObjectReference domainObject = ((DomainObjectAssignment) assign).getDomainObject().get(0);
				for (mCursor.moveToFirst(); !mCursor.isAfterLast(); mCursor.moveToNext()) {
					if (mCursor.getString(0).equals(domainObject.getId())) {
						foundSelected = true;
						break;
					}
					selectedPosition++;
				}
				mCursor.moveToFirst();
			}	
			
			
			//String[] from = new String[]{domDesc.getProjection().split(SPLIT_STR)[1]}; // Use only the first column after the ID for now
			String[] from = new String[]{mCursor.getColumnName(1)}; // Use only the first column after the ID for now
			int[] to = new int[]{android.R.id.text1};
			SimpleCursorAdapter adapter =
			  new SimpleCursorAdapter(this, android.R.layout.simple_spinner_item, mCursor, from, to );
			adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
			adapter.setViewBinder(new DomainDataBinder());

			Spinner spin = listBindings.get(prop.getName());
			spin.setAdapter(adapter);			
						
			if (foundSelected) {			
				spin.setSelection(selectedPosition);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * Update the views to reflect any change done the property they
	 * are bound to.
	 * @param prop The property to update the views for
	 */
	protected void updateViewFromProperty(Property prop) {
		PropertyAssignment assign = getPropertyOfBlock(buildingBlock, prop.getName());
		
		if (prop.getDataType() instanceof DomainObjectDesc) {
			updateDomainObjectReferenceViewFromProperty(prop, assign);
		}
		else if (prop.getDataType().getName().equals("Boolean")) {
			CheckBox cb = boolBindings.get(prop.getName());
			if (assign != null)
				cb.setChecked(Boolean.parseBoolean(assign.getValue()));
			else
				cb.setChecked(false);
		} else {
			EditText ed = bindings.get(prop.getName());
			if (assign == null) {
				ed.setText("");
			} else if (assign instanceof PropertyReference) {
				PropertyReference ref = (PropertyReference) assign;
				ed.setText("[" + ref.getFromObject().getName() + "." + ref.getFromProperty() + "]");
			} else {
				ed.setText(assign.getValue());
			}
			ed.setEnabled(!(assign instanceof PropertyReference));
			ImageButton button = buttonBindings.get(prop.getName());
			button.setImageResource( (assign instanceof PropertyReference) ? R.drawable.link_delete_icon : R.drawable.link_add_icon );
		}
	}
	
	/**
	 * Update a property by creating or updating a property 
	 * assignment for it and setting it to the specified new value.
	 * @param prop The property to update the value of
	 * @param newValue The new value to set for the property. If the new value is null or "", 
	 * the assignment for the property will be removed
	 */
	protected void updatePropertyWithValue(Property prop, String newValue) {
		removeOldAssignment(prop);
		
		// There is only something to add if the new value is non-null and not an empty string
		if ((newValue != null) && (!newValue.equals(""))) {
			// Create a new assignment
			PropertyAssignment assign = SimpleLanguageFactory.eINSTANCE.createPropertyAssignment();
			
			// Set property name and value
			assign.setProperty(prop.getName());
			assign.setValue(newValue);
			
			// Finally, add to the building blocks list of property values
			buildingBlock.getPropertyValues().add(assign);
		}
	}
	
	/**
	 * Update a property to reflect any change done in the view
	 * it is bound to.
	 * @param prop The property to update
	 */
	protected void updatePropertyFromView(Property prop) {
		// References are updated directly when selecting, and must be skipped here
		if (prop.getDataType() instanceof DomainObjectDesc)
			return;
		PropertyAssignment assign = getPropertyOfBlock(buildingBlock, prop.getName());		
		if ((assign instanceof PropertyReference))
			return;
		
		if (prop.getDataType().getName().equals("Boolean")) {
			boolean newValue = boolBindings.get(prop.getName()).isChecked();
			updatePropertyWithValue(prop, Boolean.toString(newValue));
		}
		else {
			String newValue = bindings.get(prop.getName()).getText().toString();
			updatePropertyWithValue(prop, newValue);
		}
	}
	
	/**
	 * Get the current property assignment for the specified property of a building block
	 * @param block The building block to get a property assignment of
	 * @param propertyName The name of the property to get the assignment of
	 * @return The current property assignment or null if no such assignment exists
	 */
	public PropertyAssignment getPropertyOfBlock(BuildingBlock block, String propertyName) {
		List<PropertyAssignment> propList = block.getPropertyValues();
		for (Iterator<PropertyAssignment> i = propList.iterator(); i.hasNext();) {
			PropertyAssignment propA = i.next();
			if (propA.getProperty().equals(propertyName)) {
				return propA;
			}
		}
		return null;
	}		
	
	
	// Implementation of abstract methods if super-class
	@Override
	protected void updateViewsFromModel() {
		BuildingBlockDesc descr = getBuildingBlock().getDescriptor();

		// Go through all the properties, and create a widget for displaying and editing each of them
		for (Property prop : descr.getProperties()) {
			if (!prop.isIsResultValue())
				this.updateViewFromProperty(prop);
		}   			
	}
	
	@Override
	protected void updateModelFromViews() {
		BuildingBlockDesc descr = getBuildingBlock().getDescriptor();

		// Go through all the properties, and update the property value from current value in the view
		for (Property prop : descr.getProperties()) {
			if (!prop.isIsResultValue())
				this.updatePropertyFromView(prop);
		}   			
	}   	
	
	/**
	 * Removes the current assignment for a property from the building block
	 * currently being edited
	 * @param property
	 */
	protected void removeOldAssignment(Property property) {
		BuildingBlock bb = getBuildingBlock();

		// Remove any previous property assignment
		PropertyAssignment oldPropAssign = this.getPropertyOfBlock(bb, property.getName());
		if (oldPropAssign != null)
			bb.getPropertyValues().remove(oldPropAssign);		
	}
	
	/**
	 * Set up a property reference for a property of the building block being edited.
	 * @param property The property that will refer to another property
	 * @param bbp The building block and property from which the value will be retreived at runtime
	 */
	protected void setPropertyReference(Property property, BuildingBlockAndProperty bbp) {
		BuildingBlock bb = getBuildingBlock();

		// First, remove any previous property assignment
		removeOldAssignment(property);

		//Create a new property reference 
		PropertyReference propRef = SimpleLanguageFactory.eINSTANCE.createPropertyReference();
		// Finally, set the values of the property reference
		propRef.setProperty(property.getName());
		propRef.setFromObject(bbp.buildingBlock);
		propRef.setFromProperty(bbp.property.getName());
		// Finally add to the building block
		bb.getPropertyValues().add(propRef);
	}
	
	/**
	 * Set up a domain object assignment for a property of the building block being edited.
	 * @param property The property to set the assignment of
	 * @param id The id of the domain object
	 * @param displayText The text used to display the domain object to the user
	 */
	protected void setDomainObjectAssignment(Property property, String id, String displayText) {
		BuildingBlock bb = getBuildingBlock();

		// First, remove any previous property assignment
		removeOldAssignment(property);

		// Create a new Domain Object Assignment
		DomainObjectAssignment propRef = SimpleLanguageFactory.eINSTANCE.createDomainObjectAssignment();
		
		// Create a domain object reference for the domain object to refer to
		DomainObjectReference ref = SimpleLanguageFactory.eINSTANCE.createDomainObjectReference();

		// Set values of domain object reference
		ref.setDataType((DomainObjectDesc)property.getDataType());
		ref.setDisplayText(displayText);
		ref.setId(id);
		
		// Set values of domain object assignment		
		propRef.setProperty(property.getName());
		propRef.getDomainObject().add(ref);

		// Add property reference
		bb.getPropertyValues().add(propRef);		
	}
	
	
	private void addPropertiesOfType(BuildingBlock bb, String typeName, List<BuildingBlockAndProperty> list) {
		for (Property prop : bb.getDescriptor().getProperties()) {
			if (prop.isCanBeReferedTo() && (typeName == null) || (typeName.equals(prop.getDataType().getName()))) {				
				list.add(new BuildingBlockAndProperty(bb, prop));
			}
		}
	}
	
	/**
	 * Fill the bbProperty list with all the properties which the property specified in
	 * the parameter can refer to.
	 * 
	 * @param forProperty
	 */
	private void fillBuildingBlockAndPropertyList(Property forProperty) {
		bbPropertyList.clear();
		String propertyType = forProperty.getDataType().getName();
		
		Task task = getTask();
		// Add properties of steps before this step
		for (Step step : task.getStepSequence()) {
			if (buildingBlock == step)
				break;
			addPropertiesOfType(step, propertyType, bbPropertyList);
		}
				
		// Add properties of information objects
		for (InformationObject info : task.getInfoObjects()) {
			addPropertiesOfType(info, propertyType, bbPropertyList);		
		}
		
		// Add result values (parameters) of triggers
		if (task.getTrigger() != null) {
			for (Property prop : ((TriggerDesc)(task.getTrigger().getDescriptor())).getProperties()) {
				if (prop.isIsResultValue()  && prop.isCanBeReferedTo() && (propertyType != null) &&(propertyType.equals(prop.getDataType().getName()))) {
					bbPropertyList.add(new BuildingBlockAndProperty(task.getTrigger(), prop));
				}
			}
		}
	}
	
	protected Property getCurrentDialogProperty() {
		return currentDialogProperty;
	}
	
	protected void setCurrentDialogProperty(Property property) {
		currentDialogProperty = property;
	}
	
	private Property currentDialogProperty = null;
    static final int SELECT_PROPERTY_REF = 1;
    private final List<BuildingBlockAndProperty> bbPropertyList = new  ArrayList<BuildingBlockAndProperty>();
    ArrayAdapter<BuildingBlockAndProperty> dialogListAdapter;
    
	@Override
	protected Dialog onCreateDialog(int id) {
		switch(id) {
			case SELECT_PROPERTY_REF:
				return createSelectPropertyRefDialog(this);
		}
		return super.onCreateDialog(id);
	}
	
	@Override
	protected void onPrepareDialog(int id, Dialog dialog) {
		if (id == SELECT_PROPERTY_REF) {
			// Refresh the building block and property list so that it
			// contains the possible targets for property references of
			// the currently selected property
			fillBuildingBlockAndPropertyList(getCurrentDialogProperty());
			dialogListAdapter.notifyDataSetChanged();
		}
		super.onPrepareDialog(id, dialog);
		
	}

	/**
	 * Creates the dialog that is used to select a building block and property that is used
	 * to set up a property reference
	 * @param activity
	 * @return
	 */
	protected Dialog createSelectPropertyRefDialog(final AbstractEditBuildingBlockActivity activity) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Select source building block and property:");
		fillBuildingBlockAndPropertyList(activity.getCurrentDialogProperty());

		dialogListAdapter = new ArrayAdapter<BuildingBlockAndProperty>(this, android.R.layout.select_dialog_item, bbPropertyList);
		builder.setAdapter(dialogListAdapter, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				setPropertyReference(activity.getCurrentDialogProperty(), (BuildingBlockAndProperty)bbPropertyList.get(arg1));
				updateViewFromProperty(activity.getCurrentDialogProperty());
			}} );
		return builder.create();
	}	
	
	
	/**
	 * BuildingBlockAndProperty is a helper class that keeps track of a pair of a building block
	 * and a property (which is among the properties of descriptor of the building block)
	 * @author erlend
	 *
	 */
	protected class BuildingBlockAndProperty {
		BuildingBlock buildingBlock;
		Property property;
		public BuildingBlockAndProperty(BuildingBlock bb, Property property) {
			this.buildingBlock = bb;
			this.property = property;			
		}
		
		@Override
		public String toString() {
			return buildingBlock.getName() + "." + property.getUserFriendlyName();
		}
	}
	
	
	//TODO: Implement property references for booleans
	//TODO: Consider isResultValue etc. in property reference code
	//TODO: Update code for to/from model
	//TODO: Handle multiple cardinality
}