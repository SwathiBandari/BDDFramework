package com.freecrm.cucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= "src/test/resources/features",
	glue={"com.freecrm.cucumber.stepDefinitions"},
	tags = "@UserCreation",
	plugin = {"pretty","junit:target/cucumber-reports/Cucumber.xml"}
		
	)
public class TestRunner {

}
