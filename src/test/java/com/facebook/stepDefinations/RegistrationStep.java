package com.facebook.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.facebook.base.BaseStep;
import com.facebook.loginPages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationStep extends BaseStep {

	RegistrationPage rp;
		@Given("Open {string} and put {string}")
		public void openAndPut(String browser, String url) {
			openApp(browser, url);
		}

	@When("Click on registration button")
	public void clickOnRegistrationButton() {
		rp = new RegistrationPage(driver);
		rp.createNewAccountButton();
	}
	@When("In put first Name {string}")
	public void inPutFirstName(String enterFirstName) {
		rp.firstNameField(enterFirstName);
	}
	@When("Input last Name {string}")
	public void inputLastName(String enterLastName) {
		rp.lastNameField(enterLastName);
	}
	@When("Input email {string}")
	public void inputEmail(String enterEmail) {
		rp.emailField(enterEmail);
	}
	@When("Input re enter email {string}")
	public void inputReEnterEmail(String enterconfirmEmail) {
		rp.reEnterEmail(enterconfirmEmail);
	}
	@When("Input password {string}")
	public void inputPassword(String enterYourPassword) {
		rp.passwordField(enterYourPassword);
	}
	@When("Input birth Month {string}")
	public void inputBirthMonth(String enterYourBirthMonth) {
		rp.monthDropDownField(enterYourBirthMonth);
	}
	@When("Input birth Day {string}")
	public void inputBirthDay(String enterYourBirthDay) {
		rp.dayDropDownField(enterYourBirthDay);
	}
	@When("Input birth Year {string}")
	public void inputBirthYear(String enterYourBirthYear) {
		rp.yearDropDownField(enterYourBirthYear);
	}
	@When("Input gender {string}")
	public void inputGender(String enterYourgender) {
		rp.radioButton(enterYourgender);
	}
	@Then("I can create an account")
	public void iCanCreateAnAccount() {
	    rp.signupButton();
	}
}

