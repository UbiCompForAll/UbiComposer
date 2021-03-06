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

import org.ubicompforall.simplelanguage.BuildingBlock;
import org.ubicompforall.simplelanguage.Task;
import org.ubicompforall.simplelanguage.runtime.BuildingBlockInstanceHelper;
import org.ubicompforall.simplelanguage.runtime.TaskInvoker;
import org.ubicompforall.simplelanguage.runtime.TriggerMonitor;
import org.ubicompforall.simplelanguage.runtime.android.AndroidBuildingBlockInstance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsMessage;

public class SMSReceived extends BroadcastReceiver implements TriggerMonitor, AndroidBuildingBlockInstance{
	TaskInvoker taskInvoker;
	Task task;
	Context context;
	BuildingBlockInstanceHelper helper;

	public void setContext(Context context) {
		this.context = context;
	}	
	
	@Override
	public void startMonitoring(Task task, TaskInvoker taskInvoker) {
		this.taskInvoker = taskInvoker;
		this.task = task;
		context.registerReceiver(this, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
	}

	@Override
	public void stopMonitoring() {
		context.unregisterReceiver(this);
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		
		Bundle bundle = intent.getExtras();

		Object messages[] = (Object[]) bundle.get("pdus");
		if (messages.length > 0) {
			SmsMessage smsMessage[] = new SmsMessage[messages.length];
			for (int n = 0; n < messages.length; n++) {
				smsMessage[n] = SmsMessage.createFromPdu((byte[]) messages[n]);
			}
			String phoneNumber = smsMessage[0].getDisplayOriginatingAddress();
			String message = smsMessage[0].getMessageBody();
			helper.setPropertyValue("phoneNumber", phoneNumber);
			helper.setPropertyValue("message", message);
			taskInvoker.invokeTask(task, helper.createTaskParameterMap());
		}
	}

	@Override
	public void setBuildingBlock(BuildingBlock buildingBlock) {
		helper = new BuildingBlockInstanceHelper(buildingBlock);
	}

}
