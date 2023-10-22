package com.facebook.cucumberRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)// Find the Cucumber Class in this project
@CucumberOptions(
plugin= {"pretty", "html:target/facebookReport.html"},// Path for the report Location

features="src/test/resources/features",// path for the Login Feature
glue="com.facebook.stepDefinations", // Path for the StepDefinations
tags="@common",
snippets=SnippetType.CAMELCASE
		
		)
public class FacebookRunner {

}
