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
package com.orchestral.automation.dryselcore.demo.stepdefs;

import com.orchestral.automation.dryselcore.demo.login.LoginPageInput;
import com.orchestral.automation.dryselcore.demo.login.LoginPageOutput;
import com.orchestral.automation.dryselcore.demo.login.LoginPageUI;
import com.orchestral.automation.dryselcore.demo.userinfo.UserInfoUI;
import com.orchestral.automation.dryselcore.eventlib.ElementNotEnabledException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	@Given("^Joe is an authorized user$")
	public void openWeb() throws Throwable {
		new AppLaunch().openWebApp();
	}

	@When("^Joe enters correct user-name and password$")
	public void loginAsJoe() {
		try {
			new StepDefHelper().getTestExecutor().executeInputScript(new LoginPageUI().getTestObjects(),
					new LoginPageInput().getTestObjects());
		} catch (final ElementNotEnabledException e) {
			e.printStackTrace();
		}
	}

	@Then("^User information page should be displayed$")
	public void user_information_page_should_be_displayed() {
		try {
			new StepDefHelper().getTestExecutor().executeOutputScript(new UserInfoUI().getTestObjects(),
					new LoginPageOutput().getTestObjects());
		} catch (final ElementNotEnabledException e) {
			e.printStackTrace();
		}
	}
}
