package com.facebook.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStep { // where we write all the test class
	// Base test is the parent class
	public WebDriver driver; // public means everybody can have access
	

	
	public WebDriver openApp(String browser, String url) {
		if (browser.equalsIgnoreCase("Chrome")) {// if, else if, else - is called regular conditional statement
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("Edge") ) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		} else if (browser == "Firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		} else { // it will be default browser when we don;t declare anything.
			System.out.println("Chrome is running as default");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		//this space is out of nested but inside the method
		driver.manage().window().maximize(); // we put here because we don't need to put every block because of inside the method.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		return driver;

	}

	
	public void closeApp() {
		if (driver != null) { // =null means driver is here
			driver.quit();
		}
	}


}
