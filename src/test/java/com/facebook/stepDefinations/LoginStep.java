package com.facebook.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;
	@Given("I open facebook app")
	public void iOpenFacebookApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	@When("enter my valid user name and password")
	public void enterMyValidUserNameAndPassword() {
		driver.findElement(By.id("email")).sendKeys("Sumon");
		driver.findElement(By.id("pass")).sendKeys("Nurul");
	}
	@When("click login button")
	public void clickLoginButton() {
	
	}
	@Then("i can be logged in")
	public void iCanBeLoggedIn() {
	}



}
