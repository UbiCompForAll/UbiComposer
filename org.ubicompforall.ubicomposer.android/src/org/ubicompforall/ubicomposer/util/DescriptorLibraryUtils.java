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
package org.ubicompforall.ubicomposer.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.ubicompforall.descriptor.BuildingBlockDesc;
import org.ubicompforall.descriptor.Classifier;
import org.ubicompforall.descriptor.DescriptorLibrary;
import org.ubicompforall.descriptor.QueryDesc;
import org.ubicompforall.descriptor.StepDesc;
import org.ubicompforall.descriptor.TriggerDesc;
import org.ubicompforall.simplelanguage.UserService;

public class DescriptorLibraryUtils {
	/**
	 * Get a list of all the building blocks of the specified type in the descriptor libraries
	 * registered for the user service.  
	 * @param userService The user service to get the building block descriptors of
	 * @param ofType The class specifying the type of the building blocks to retrieve
	 * @return
	 */
	public static List<BuildingBlockDesc> getBuildingBlocksOfType(UserService userService,Class<? extends BuildingBlockDesc> ofType) {
		List<BuildingBlockDesc> result = new ArrayList<BuildingBlockDesc>();
		EList<DescriptorLibrary> libraries = userService.getLibraries();
		for (DescriptorLibrary lib : libraries) {
			for (Classifier block : lib.getBuildingBlocks()) {
				if (ofType.isInstance(block)) {
					result.add((BuildingBlockDesc)block);
				}
			}
		}
		return result;		
	}

	/**
	 * Retrieve all trigger descriptors in the descriptor libraries registered for the user service
	 * @param userService
	 * @return List of trigger descriptors
	 */
	public static List<BuildingBlockDesc> getTriggerDescs(UserService userService) {
		return getBuildingBlocksOfType(userService, TriggerDesc.class);
	}
	
	/**
	 * Retrieve all step descriptors in the descriptor libraries registered for the user service
	 * @param userService
	 * @return List of step descriptors
	 */
	public static List<BuildingBlockDesc> getStepDescs(UserService userService) {
		return getBuildingBlocksOfType(userService, StepDesc.class);
	}

	/**
	 * Retrieve all query descriptors in the descriptor libraries registered for the user service
	 * @param userService
	 * @return List of query descriptors
	 */
	public static List<BuildingBlockDesc> getQueryDescs(UserService userService) {
		return getBuildingBlocksOfType(userService, QueryDesc.class);
	}
}
