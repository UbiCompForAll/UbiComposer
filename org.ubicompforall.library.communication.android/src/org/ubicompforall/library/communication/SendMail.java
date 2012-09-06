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
import android.content.Intent;

public class SendMail extends AbstractStepInstance implements AndroidBuildingBlockInstance {
	Context context;
	
	public void setContext(Context context) {
		this.context = context;
	}

	@Override
	public void execute() {
		sendMail(getStringPropertyValue("mailAddress"), getStringPropertyValue("subject"), getStringPropertyValue("message"));
	}
	
	private void sendMail(String address, String subject, String message) {
		Intent i = new Intent(Intent.ACTION_SEND);
		i.setType("message/rfc822");
		i.putExtra(Intent.EXTRA_EMAIL  , new String[]{address});
		i.putExtra(Intent.EXTRA_SUBJECT, subject);
		i.putExtra(Intent.EXTRA_TEXT   , message);
		try {
		    context.startActivity(Intent.createChooser(i, "Send mail..."));
		} catch (android.content.ActivityNotFoundException ex) {
			// TODO: Add error message?
		}

		//Toast.makeText(context, "SendMail to: " + address + " subject: " + subject + " message: " + message, Toast.LENGTH_SHORT);
	}

}
