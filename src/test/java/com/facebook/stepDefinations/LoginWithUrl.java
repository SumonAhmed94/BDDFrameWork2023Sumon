package com.facebook.stepDefinations;

import org.openqa.selenium.By;

import com.facebook.base.BaseStep;
import com.facebook.loginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithUrl extends BaseStep {
	LoginPage lp;
	//String browser="chrome";
	@Given("user open {string} and {string}")
	public void userOpenAnd(String browser, String url) {
		openApp(browser, url);
	
	}
	@When("user enter username {string}")
	public void userEnterUsername(String username) {
	lp=new LoginPage(driver);
	lp.userNameMethod(username);
	
	}
	@When("user enter password {string}")
	public void userEnterPassword(String password) {
	lp.passWordMethod(password);
	}
	@When("user click on login button")
	public void userClickOnLoginButton() {
	lp.logingButton();
	}
	@Then("user logged in facebook")
	public void userLoggedInFacebook() {
		closeApp();
	}



}
