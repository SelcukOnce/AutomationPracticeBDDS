package com.automationpractice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/login1.feature"},
		glue = {"com.automationpractice.login"},
		monochrome = true
	, dryRun = true    
		/*
		 * for none implemented steps. then comment it or change to false
		 */
		)
public class Runner {}
