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
package com.orchestral.automation.dryselcore.demo.userinfo;

import com.orchestral.automation.dryselcore.eventlib.Click;
import com.orchestral.automation.dryselcore.eventlib.CompareText;
import com.orchestral.automation.dryselcore.eventlib.SelectByVisibleText;
import com.orchestral.automation.dryselcore.eventlib.SendKeys;
import com.orchestral.automation.dryselcore.helper.TestObjectHelper;
import com.orchestral.automation.dryselcore.model.UIElement;

public class UserInfoUI extends TestObjectHelper<UIElement> {

	@Override
	public void addTestObjects() {
		// UI for input
		this.testObjects.add(new UIElement("firstName", ".//*[@id='firstname']", new SendKeys(), null));
		this.testObjects.add(new UIElement("lastName", ".//*[@id='lastname']", new SendKeys(), null));
		this.testObjects.add(new UIElement("addressLine1", ".//*[@id='address-line-1']", new SendKeys(), null));
		this.testObjects.add(new UIElement("addressLine2", ".//*[@id='address-line-2']", new SendKeys(), null));
		this.testObjects.add(new UIElement("city", ".//*[@id='city']", new SendKeys(), null));
		this.testObjects.add(new UIElement("state", ".//*[@id='state']", new SelectByVisibleText(), null));
		this.testObjects.add(new UIElement("zip", ".//*[@id='zipcode']", new SendKeys(), null));
		this.testObjects.add(new UIElement("saveButton", ".//*[@id='button-save']", new Click(), null));
		// UI for output
		this.testObjects.add(new UIElement("userInfoHeader", ".//*[@id='user-info']", null, new CompareText()));
		this.testObjects.add(new UIElement("nameOut", ".//*[@id='name']", null, new CompareText()));
		this.testObjects.add(new UIElement("addressOut1", ".//*[@id='address1']", null, new CompareText()));
		this.testObjects.add(new UIElement("addressOut2", ".//*[@id='address2']", null, new CompareText()));
	}

}
