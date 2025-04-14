package com.bdd.automation.stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	GitHubLogin github;
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver= new ChromeDriver();
		github = new GitHubLogin(driver);
		driver.get("https://github.com/login");
		driver.navigate().refresh();
	}

	@When("user enters invalid username and invalid password")
	public void user_enters_invalid_username_and_invalid_password() {
		github.verifyFormTitle();
		github.enterUserCred(" ", " ");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    
	}

	@Then("user validates the error message {string}")
	public void user_validates_the_error_message(String string) {
	    
	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
		github.verifyFormTitle();
		github.enterUserCred("bhudhbjd", " ");
	}

	@When("user enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		github.verifyFormTitle();
		github.enterUserCred("bhudhbjd", "bdjhbjdb");
	}

	@Then("user validates the homepage")
	public void user_validates_the_homepage() {
	    
	}



}
