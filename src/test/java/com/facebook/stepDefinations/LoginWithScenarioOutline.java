package com.facebook.stepDefinations;

import com.facebook.base.BaseStep;
import com.facebook.loginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithScenarioOutline extends BaseStep{
LoginPage lp;
		@Given("user enter {string} and {string} to open application")
		public void userEnterAndToOpenApplication(String browser, String url) {
			openApp(browser, url);
			
		}
		@When("user enter {string} and {string} on the input field")
		public void userEnterAndOnTheInputField(String username, String password) {
			lp=new LoginPage(driver);
			lp.userNameMethod(username);
			lp.passWordMethod(password);
			
		}
		
		@When("user click on loginButton")
		public void userClickOnLoginButton() {
			lp.logingButton();
		}


		@Then("user close the application")
		public void userCloseTheApplication() {
			closeApp();
		
		}


}
