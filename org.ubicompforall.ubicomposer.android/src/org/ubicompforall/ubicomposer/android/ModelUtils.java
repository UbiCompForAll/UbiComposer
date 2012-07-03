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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.ubicompforall.descriptor.UbiCompDescriptorPackage;
import org.ubicompforall.simplelanguage.SimpleLanguagePackage;
import org.ubicompforall.simplelanguage.UserService;
import org.ubicompforall.ubicomposer.util.UserServiceUtils;

import android.content.Context;
import android.content.res.AssetManager;
import android.widget.Toast;

public class ModelUtils {

	/**
	 * Create a new UserService with references to the pre-defined descriptor libraries.
	 * The new name of the new user service is set to the name specified as a parameter
	 * @param context The Android context in which the user service is created
	 * @param name The name to use for the new user service
	 * @return An instance of UserService with library references and name set
	 */
    public static UserService createModel(Context context, String name) {
		@SuppressWarnings("unused")
		SimpleLanguagePackage pkg = SimpleLanguagePackage.eINSTANCE;
		@SuppressWarnings("unused")
		UbiCompDescriptorPackage pkg2 = UbiCompDescriptorPackage.eINSTANCE;
    	UserService userService = UserServiceUtils.newUserService();
    	userService.setName(name);
    	UserServiceUtils.addLibraryToUserService(context.getFileStreamPath("Communication.ubicompdescriptor").getAbsolutePath(), userService);
		return userService;
    }

    /**
     * Copies all the assets found in the desc sub-folder to the data area provided by the context 
     * @param context
     */
    public static void copyAssetFiles(Context context) {
    	AssetManager man = context.getAssets();
    	try {
			String fileNames[] = man.list("desc");
			for (String crFile : fileNames) {
				InputStream is = man.open("desc/" + crFile);
				FileOutputStream os = context.openFileOutput(crFile, Context.MODE_WORLD_READABLE);
				byte[] buffer = new byte[1024];
			    int read;
			    while((read = is.read(buffer)) != -1){
			    	os.write(buffer, 0, read);
			    }
			    os.flush();
			    os.close();
			    is.close();
			}
		} catch (IOException e) {
			Toast.makeText(context, "Error while prepearing resources : " + e.getMessage(), Toast.LENGTH_LONG);
			e.printStackTrace();
		}
    	
    }    
}
