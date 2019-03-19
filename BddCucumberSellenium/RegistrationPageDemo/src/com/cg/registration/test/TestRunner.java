package com.cg.registration.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue= {"com.cg.registration.stepdefinition"},
		tags= {"@execute"})
public class TestRunner {

}
