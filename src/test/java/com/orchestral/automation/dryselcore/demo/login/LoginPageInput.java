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

import com.orchestral.automation.dryselcore.helper.TestObjectHelper;
import com.orchestral.automation.dryselcore.model.TestDatum;

public class LoginPageInput extends TestObjectHelper<TestDatum> {

	@Override
	public void addTestObjects() {
		this.testObjects.add(new TestDatum(1, "userName", "joe"));
		this.testObjects.add(new TestDatum(2, "password", "admin"));
		this.testObjects.add(new TestDatum(3, "loginButton", null));
		this.testObjects.add(new TestDatum(4, "waitForMiliSeconds", "1000"));
	}

}
