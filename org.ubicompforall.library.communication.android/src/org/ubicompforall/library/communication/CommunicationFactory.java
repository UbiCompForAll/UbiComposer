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

import java.util.HashMap;
import java.util.Map;

import org.ubicompforall.simplelanguage.runtime.BuildingBlockInstance;
import org.ubicompforall.simplelanguage.runtime.MapBasedBuildingBlockFactory;
import org.ubicompforall.simplelanguage.runtime.android.AndroidBuildingBlockFactory;
import org.ubicompforall.simplelanguage.runtime.android.AndroidBuildingBlockInstance;

import android.content.Context;

public class CommunicationFactory extends MapBasedBuildingBlockFactory implements AndroidBuildingBlockFactory {
	Context context;
	
	@Override
	public BuildingBlockInstance createBuildingBlock(String buildingBlockName) {
		// TODO Auto-generated method stub
		BuildingBlockInstance inst = super.createBuildingBlock(buildingBlockName);
		if (inst instanceof AndroidBuildingBlockInstance)
			((AndroidBuildingBlockInstance)inst).setContext(context);
		return inst;
	}

	private static final Map<String,Class<? extends BuildingBlockInstance>> MAP = createMap();
	
	private static Map<String,Class<? extends BuildingBlockInstance>> createMap() {
		Map<String, Class<? extends BuildingBlockInstance>> classMap = new HashMap<String,Class<? extends BuildingBlockInstance>>();
		
		classMap.put("SendSMS", SendSMS.class);
		classMap.put("sendMail", SendMail.class);
		classMap.put("IncommingCall", IncommingCallMonitor.class);
		classMap.put("SMSReceived", SMSReceived.class);
		classMap.put("Example", Example.class);		
		return classMap;
	}
	
	public CommunicationFactory() {
		super(MAP);
	}

	@Override
	public void setContext(Context context) {
		this.context = context;		
	}
	

}
