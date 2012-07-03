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
package org.ubicompforall.simplelanguage.runtime.android;

import org.ubicompforall.simplelanguage.runtime.BuildingBlockFactory;
import org.ubicompforall.simplelanguage.runtime.CompositeBuildingBlockFactory;

import android.content.Context;

public class AndroidCompositeBuildingBlockFactory extends
		CompositeBuildingBlockFactory implements AndroidBuildingBlockFactory {

	@Override
	public void setContext(Context context) {
		for (BuildingBlockFactory fac : factories) {
			if (fac instanceof AndroidBuildingBlockFactory) 
				((AndroidBuildingBlockFactory)fac).setContext(context);
		}
	}

}
