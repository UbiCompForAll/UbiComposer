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
package org.ubicompforall.library.communication;

import java.util.Map;

import org.ubicompforall.simplelanguage.runtime.AbstractStepInstance;
import org.ubicompforall.simplelanguage.runtime.TaskInstance;
import org.ubicompforall.simplelanguage.runtime.android.AndroidBuildingBlockInstance;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.Settings;

public class Example extends AbstractStepInstance implements AndroidBuildingBlockInstance {
	Context context;
	
	@Override
	public int execute(TaskInstance context, Map<String, Object> parameters) {
		doExample(getPropertyValue("theBool", parameters), getStringValue("theNumber", parameters), getStringValue("theDate", parameters), getStringValue("theString", parameters));
		return 0;
	}
	
	private void doExample(Object theBool, String theNumber, String theDate, String theString) {
		MediaPlayer mediaPlayer = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
		if (mediaPlayer != null)
			mediaPlayer.start();		
		//Toast.makeText(context, "Example with bool : " + theBool + " Number : " + theNumber + " Date : " + theDate + " String: " + theString, Toast.LENGTH_SHORT);
	}

	@Override
	public void setContext(Context context) {
		this.context = context;
		
	}

}
