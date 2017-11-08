/*
 * Copyright (c) Orchestral Developments Ltd and the Orion Health group of companies (2001 - 2017).
 * Author: Kuldeep Sinh Chauhan (@KuldeepSinhC)
 * emails: kuldeeps@orionhealth.com, chauhan.kuldeep.sinh@gmail.com
 *
 * This file is provided to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an  "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,  either express or implied.  See the License for the specific language governing    
 * permissions and limitations under the License.
 */
package com.orchestral.automation.dryselcore.demo.login;

import com.orchestral.automation.dryselcore.eventlib.Click;
import com.orchestral.automation.dryselcore.eventlib.CompareText;
import com.orchestral.automation.dryselcore.eventlib.SendKeys;
import com.orchestral.automation.dryselcore.eventlib.WaitForMiliSeconds;
import com.orchestral.automation.dryselcore.helper.TestObjectHelper;
import com.orchestral.automation.dryselcore.model.UIElement;

public class LoginPageUI extends TestObjectHelper<UIElement> {

	@Override
	public void addTestObjects() {
		// add UI element representing the header of the login page panel
		this.testObjects.add(new UIElement("loginHeader", ".//*[@id='login']", new CompareText(), null));
		this.testObjects.add(new UIElement("userName", ".//*[@id='username']", new SendKeys(), null));
		this.testObjects.add(new UIElement("password", ".//*[@id='password']", new SendKeys(), null));
		this.testObjects.add(new UIElement("loginButton", ".//*[@id='button-login']", new Click(), null));
		// Wait for the element
		this.testObjects
				.add(new UIElement("waitForMiliSeconds", "waitForMiliSeconds", new WaitForMiliSeconds(), null));
	}

}
