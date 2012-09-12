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

import java.util.Iterator;
import java.util.List;

import org.ubicompforall.descriptor.Property;
import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.DomainObjectAssignment;
import org.ubicompforall.simplelanguage.PropertyAssignment;
import org.ubicompforall.simplelanguage.PropertyReference;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Adapter class for a list of building block descriptors, allow
 * presentation of the building blocks in a list with icon, type name, 
 * and user defined name.
 * @author erlend
 *
 */
public class BuildingBlockListAdapter<T> extends ArrayAdapter<T> {

	LayoutInflater inflater;
	
	
	/**
	 * Helper class that holds the icon and text fields that are used for to display
	 * a line in the list.
	 */
	static class ViewHolder {
		ImageView stepIcon;
		TextView typeNameText;
		TextView userDefinedNameText;
	}
	
	public BuildingBlockListAdapter(Context context, int resource,
			int textViewResourceId, List<T> objects) {
		super(context, resource, textViewResourceId, objects);
		inflater = LayoutInflater.from(context);
	}
	
	final static int VALIDATE_PASS = Color.BLACK;
	final static int VALIDATE_FAIL = Color.RED;
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		
		if (convertView == null) {
			// Created the view by inflating its layout and create a holder that keeps
			// track of the icon and text views for later access 
			convertView = inflater.inflate(R.layout.ubicomposer_step_layout, null);
			holder = new ViewHolder();
			holder.stepIcon = (ImageView)convertView.findViewById(R.id.ubicomposer_stepIconView);
			holder.typeNameText = (TextView)convertView.findViewById(R.id.ubicomposer_mainStepText);
			holder.userDefinedNameText = (TextView)convertView.findViewById(R.id.ubicomposer_minorStepText);
			// Register the holder as a tag on the view
			convertView.setTag(holder);
		}
		else {
			// Retrieve the holder from the tag of the view
			holder = (ViewHolder)convertView.getTag();
		}
		
		Object crItem = this.getItem(position);
		if (crItem instanceof BuildingBlock) {
			
			// First, retrieve the icon based on URL using the holder to find the icon view
			// TODO: consider to optimize this by caching images
			String iconFileName = "";
			try {
				iconFileName = parent.getContext().getFileStreamPath(((BuildingBlock) crItem).getDescriptor().getIconUrl()).getAbsolutePath();
				holder.stepIcon.setImageURI(Uri.parse(iconFileName));
			} catch (Exception e) {
				holder.stepIcon.setImageURI(null);
			}
			
			// Next, set the text descriptions using the holder to find the text views
			holder.typeNameText.setText(((BuildingBlock) crItem).getDescriptor().getUserFriendlyName());
			holder.userDefinedNameText.setText(((BuildingBlock) crItem).getName());
			if (validate((BuildingBlock) crItem)) 
				convertView.setBackgroundColor(VALIDATE_PASS);
			else
				convertView.setBackgroundColor(VALIDATE_FAIL);
		}
		
		return convertView;
	}
	
	protected boolean validate(BuildingBlock bb) {
		// Check that all required properties have value set
		for (Property prop : bb.getDescriptor().getProperties()) {
			if (prop.getLowerBound() > 0) {
				// The property is required. Check that there is an assignment
				PropertyAssignment assign = getPropertyOfBlock(bb, prop.getName());
				if (assign == null)
					return false;
				else {
					// If the assignment is a value assignment, check for blank string
					if ((!(assign instanceof DomainObjectAssignment)) && (!(assign instanceof PropertyReference))) {
						if ((assign.getValue() == null) || (assign.getValue().equals(""))) 
							return false;
					}
				}
			}
		}
		
		return true;
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
	
	// TODO: Consider to change representation of properties - it is very inefficient to find the assignments
}
