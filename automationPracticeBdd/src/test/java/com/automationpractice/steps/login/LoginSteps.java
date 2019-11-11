package com.automationpractice.steps.login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import com.automationpractice.pages.login.LoginPage;
import com.automationpractice.pages.my_account.MyAccountPage;
import com.automationpractice.utilities.CommonStep;

import static org.junit.Assert.*;

public class LoginSteps extends CommonStep {
	
	private WebDriver driver = getDriver();
	private LoginPage loginPage = new LoginPage(driver);
	private MyAccountPage myAccountPage = new MyAccountPage(driver);

	@Given("User navigates to home page")
	public void user_navigates_to_home_page() {
		
	}

	@And("User inputs email and password")
	public void user_inputs_email_and_password() {
		String email = "abc213@mailinator.com";
		String password = "abc1234";
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
	}

	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
		loginPage.clickSignInButton();
	}

	@When("User is on account page")
	public void user_is_on_account_page() {
		String actualHeader = myAccountPage.getHeader();
		assertEquals("MY ACCOUNT", actualHeader);
	}
}
