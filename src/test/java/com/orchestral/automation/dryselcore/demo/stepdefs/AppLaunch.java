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

import com.orchestral.automation.dryselcore.demo.applauncher.WebBrowserInput;
import com.orchestral.automation.dryselcore.demo.applauncher.WebBrowserOutput;
import com.orchestral.automation.dryselcore.demo.applauncher.WebBrowserUI;
import com.orchestral.automation.dryselcore.demo.login.LoginPageUI;
import com.orchestral.automation.dryselcore.eventlib.ElementNotEnabledException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppLaunch {

	@Given("^Joe is a user$")
	public void joe_is_a_user() {
	}

	@When("^Joe enters correct URL of the web app$")
	public void openWebApp() {
		try {
			new StepDefHelper().getTestExecutor().executeInputScript(new WebBrowserUI().getTestObjects(),
					new WebBrowserInput().getTestObjects());
		} catch (final ElementNotEnabledException e) {
			e.printStackTrace();
		}
	}

	@Then("^login page of the web app should be displayed$")
	public void login_page_of_the_web_app_should_be_displayed() throws Throwable {
		new StepDefHelper().getTestExecutor().executeOutputScript(new LoginPageUI().getTestObjects(),
				new WebBrowserOutput().getTestObjects());
	}
}
