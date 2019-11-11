Feature: Login

#Gherkin Syntax

Scenario: User should be able to contact customer service
	Given User navigates to home page
	When User clicks on sign in link
	And User inputs email and password
	Then User is on account page
