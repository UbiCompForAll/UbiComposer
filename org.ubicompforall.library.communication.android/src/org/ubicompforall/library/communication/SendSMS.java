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

import java.util.List;
import java.util.Map;

import org.ubicompforall.simplelanguage.runtime.AbstractStepInstance;
import org.ubicompforall.simplelanguage.runtime.TaskInstance;
import org.ubicompforall.simplelanguage.runtime.android.AndroidBuildingBlockInstance;

import android.content.Context;
import android.telephony.SmsManager;

public class SendSMS extends AbstractStepInstance implements AndroidBuildingBlockInstance {
	Context context;
	

	@Override
	public void execute() {
		sendSMS(getStringPropertyValue("phoneNumber"), getStringPropertyValue("message"));		
	}
	
	private void sendSMS(String phoneNumber, String message) {
/*		PendingIntent pi = PendingIntent.getActivity(this, 0,
				new Intent(this, SMS.class), 0);                
		SmsManager sms = SmsManager.getDefault();
		sms.sendTextMessage(phoneNumber, null, message, pi, null);        */
		//Toast.makeText(context, "Send SMS to: " + phoneNumber + " message: " + message, Toast.LENGTH_SHORT);
		

        SmsManager smsMngr = SmsManager.getDefault();

        List<String> messages = smsMngr.divideMessage(message);

        for (String smsMessage : messages) {
            smsMngr.sendTextMessage(phoneNumber, null, smsMessage, 
            		null, null );
            		//PendingIntent.getBroadcast(context, 0, new Intent(ACTION_SMS_SENT), 0), null);
        }
		
	}

	@Override
	public void setContext(Context context) {
		this.context = context;
	}

}
