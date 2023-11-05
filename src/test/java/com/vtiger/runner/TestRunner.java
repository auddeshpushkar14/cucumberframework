package com.vtiger.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/",
		glue = "com.vtiger.stepdefinitions",
		//dryRun = true,
		tags = "@komal",
		//monochrome = false,
		plugin = { "pretty", "html:target/cucumber-html-report.html","json:target/cucumber.json" }
		
		
		
		
		)
public class TestRunner {

}
