package com.facebook.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.facebook.Utilities.ExcelReader;
import com.facebook.base.BaseStep;
import com.facebook.loginPages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationStep extends BaseStep {
	WebDriver driver;
	RegistrationPage rp;
	ExcelReader exReader;
	String file = "src/test/resources/registration.xlsx";
	String sheetName = "Sheet1";
	
	@Given("I want to create a facebook account")
	public void iWantToCreateAFacebookAccount() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}

	@When("click to create account button")
	public void clickToCreateAccountButton() {
		rp=new RegistrationPage(driver);
		rp.createNewAccountButton();
		exReader=  new ExcelReader(file, sheetName);
		
	}

	@When("enter my valid user firstname and lastname")
	public void enterMyValidUserFirstnameAndLastname() {
		rp.firstNameField(exReader.getStringCellValue(1, 0));
		rp.lastNameField(exReader.getStringCellValue(1, 1));
		rp.emailField(exReader.getStringCellValue(1, 3));
		rp.reEnterEmail(exReader.getStringCellValue(1, 3));
	}

	@When("create valid password")
	public void createValidPassword() {
		rp.passwordField(exReader.getStringCellValue(1, 4));
	}

	@When("enter valid dateofbirth")
	public void enterValidDateofbirth() {
		rp.monthDropDownField(exReader.getStringCellValue(1, 5));
		rp.dayDropDownField(exReader.getStringCellValue(1, 6));
		rp.yearDropDownField(exReader.getStringCellValue(1, 7));

	}

	@When("enter gender")
	public void enterGender() {
		rp.radioButton(exReader.getStringCellValue(1, 8));

	}

	@When("click signup button")
	public void clickSignupButton() {
		rp.signupButton();

	}

	@Then("so that i can be created an account")
	public void soThatICanBeCreatedAnAccount() {

	}

}
