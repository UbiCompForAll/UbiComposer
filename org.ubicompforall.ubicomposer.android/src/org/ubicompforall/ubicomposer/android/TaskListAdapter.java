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

import java.util.List;

import org.ubicompforall.simplelanguage.Task;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Adapter class for displaying tasks in a list of icon, name, and
 * activation check box.
 * @author erlend
 *
 */
public class TaskListAdapter<T> extends ArrayAdapter<T> {

	LayoutInflater inflater;
	
	
	/**
	 * Helper class that holds the icon, text view, and check box to display
	 * at a line in the list.
	 */
	static class ViewHolder {
		ImageView bbIcon;
		TextView bbText;
		CheckBox bbCheck;
	}
	
	public TaskListAdapter(Context context, int resource,
			int textViewResourceId, List<T> objects) {
		super(context, resource, textViewResourceId, objects);
		inflater = LayoutInflater.from(context);
	}
	
		
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		
		if (convertView == null) {
			// Created the view by inflating its layout and create a holder that keeps
			// track of the icon, text view and check box for later access 
			convertView = inflater.inflate(R.layout.ubicomposer_task_list_item_layout, null);
			holder = new ViewHolder();
			holder.bbIcon = (ImageView)convertView.findViewById(R.id.ubicomposer_taskItemIconView);
			holder.bbText = (TextView)convertView.findViewById(R.id.ubicomposer_taskItemNameText);
			holder.bbCheck = (CheckBox)convertView.findViewById(R.id.ubicomposer_taskActiveCheckBox);
			holder.bbCheck.setTag(this.getItem(position));
			// Register a listener that will store activation and deactivation of the task
			holder.bbCheck.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
					if (arg0.getTag() instanceof Task) {
						((Task)arg0.getTag()).setActive(arg1);
					}
				}
			});
			// Register the holder as a tag on the view
			convertView.setTag(holder);
		}
		else {
			// Retrieve the holder from the tag of the view
			holder = (ViewHolder)convertView.getTag();
		}
		
		Object crItem = this.getItem(position);
		if (crItem instanceof Task) {
			
			// First, retrieve the icon based on URL using the holder to find the icon view
			// TODO: consider to optimize this by caching images
			String iconFileName = "";
			try {
				iconFileName = parent.getContext().getFileStreamPath(((Task) crItem).getTrigger().getDescriptor().getIconUrl()).getAbsolutePath();
				holder.bbIcon.setImageURI(Uri.parse(iconFileName));
			} catch (Exception e) {
				holder.bbIcon.setImageURI(null);
			}
			
			// Next, set the text description and the check box value using the holder to find the text views
			holder.bbText.setText(((Task) crItem).getName());
			holder.bbCheck.setChecked(((Task) crItem).isActive());
		}
		
		return convertView;
	}
	
	
}
