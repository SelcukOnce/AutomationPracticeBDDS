@login
Feature: Login
#	some text regarding you feature file

#Gherkin Syntax
#	given
	# Steps key words
	# Given, When, And, But, Then

@smokeTest
Scenario: User login validation
	Given User navigates to home page
	When User clicks on sign in link
	And User inputs email and password
	And User clicks sign in button
	Then User is on account page


@negative
Scenario: User login validation with invalid credentials
	Given User navigates to home page
	When User clicks on sign in link
	And User inputs "invalid" and ""
	And User clicks sign in button
	Then User should see error message ""	

	
