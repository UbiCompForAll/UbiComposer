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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.ubicompforall.simplelanguage.SimpleLanguageFactory;
import org.ubicompforall.simplelanguage.UserService;

/**
 * Class with utility functions for creating, saving, loading, and adding libraries to user services
 * 
 * @author erlend 
 *
 */
public class UserServiceUtils {
	
	
	/**
	 * Create a resource set with the correct factories for XMI serialization 
	 * of resource associated with the .simplelanguage and .ubicompdescriptor 
	 * file extensions.
	 * @return An new resource set with registered factories
	 */
	protected static ResourceSet createAndInitResourceSet() {
		// Create a resource set and register XMI resource factory
		// associated with ".simplelanguage" and ".ubicompdescriptor" file extension
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ubicompdescriptor", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("simplelanguage", new XMIResourceFactoryImpl());
		return resourceSet;
	}
	
	
	
	/**
	 * Create a new user service, and return the initialized service
	 * @return
	 */
	public static UserService newUserService() {
		// Create an initialized resource set 
		ResourceSet resourceSet = createAndInitResourceSet();

		// Create a new resource associated with a file
		URI fileURI = URI.createURI("MyTest.simplelanguage"); //).getAbsolutePath();
		// URI fileURI = URI.createFileURI("MyTest.simple");
		Resource resource = resourceSet.createResource(fileURI);

		// Create a user service as the root element, and set its name
		UserService userService = SimpleLanguageFactory.eINSTANCE.createUserService();
		userService.setName("New user service");

		/* Old example code commented out
		// Create an instance of a task, set its name, and add to the
		// content of the resource at root
		Task myTask = SimpleLanguageFactory.eINSTANCE.createTask();
		myTask.setName("My first task");
		userService.getTasks().add(myTask);
		*/
				
		resource.getContents().add(userService);	
		return userService;
		
	}

	/**
	 * Load a user service the the specified fileURI, and return the result.
	 * 
	 * @param fileURI
	 * @return The loaded user service, or null if the service could not be found
	 */
	public static UserService loadUserService(String fileURI) {
		
		if(fileURI !=null){
			ResourceSet resourceSet = createAndInitResourceSet(); 
			
			//Set the file name from the dialog
			URI uri = URI.createFileURI(fileURI);
			Resource resource = resourceSet.getResource(uri, true);
			try {
				UserService userService = (UserService)resource.getContents().get(0);

				return userService;				
			}
			catch (Exception e){
				System.out.println("failed to load user service : " + fileURI);
			}			
		}			
		return null;
	}

	/**
	 * Load and add a descriptor library and add to the specified userService.
	 * 
	 * @param fileURI
	 * @param userService
	 * @return True if the library was found and added to the userService, otherwise false.
	 */
	public static boolean addLibraryToUserService(String fileURI, UserService userService) {
		
		if ((fileURI!=null) && (userService != null)){
			// Load the library into the same resource set as the current user service 
			ResourceSet resourceSet = userService.eResource().getResourceSet();			
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ubicompdescriptor", new XMIResourceFactoryImpl());
			URI uri = URI.createFileURI(fileURI);
			Resource resource = resourceSet.getResource(uri, true);
			EcoreUtil.resolveAll(resourceSet);
			try {
				org.ubicompforall.descriptor.DescriptorLibrary library = (org.ubicompforall.descriptor.DescriptorLibrary)resource.getContents().get(0);

				// Add this library to the user service
				userService.getLibraries().add(library);
				return true;
			}
			catch (Exception e) {
				System.out.println("failed to load libarary : " + fileURI);
			}			
		}
		return false;
	}	

	/**
	 * Save a user service to file using the specified fileURI
	 * 
	 * @param fileURI
	 * @param userService
	 * @return True if the user service was saved, false otherwise
	 */
	public static boolean saveUserService(String fileURI, UserService userService) {
		if ((fileURI != null) && (userService != null)) {
		
			try {

				URI uri = URI.createFileURI(fileURI);
				Resource resource = userService.eResource();
				resource.setURI(uri);
				Map<String, String> options = new HashMap<String, String>();
				options.put(XMLResource.OPTION_ENCODING, "UTF-8");
				resource.save(options);
				return true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
}
