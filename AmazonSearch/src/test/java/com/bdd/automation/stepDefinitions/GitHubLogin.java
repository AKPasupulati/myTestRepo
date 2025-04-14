package com.bdd.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubLogin {
	WebDriver driver;
	@FindBy(id="login")
	WebElement pageTitle;
	
	@FindBy(id="login_field")
	WebElement txtFName;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(name="commit")
	WebElement btnSignIn;
	
	GitHubLogin(WebDriver driver){
		this.driver= driver;
		 PageFactory.initElements(driver, this);  
	}
	
	public void verifyFormTitle() {
		String title = pageTitle.getText();
		if(title.contains("Sign in to GitHub")) {
			System.out.println("Test case passed");
		}
	}
	public void enterUserCred(String uname, String passwrd) {
		txtFName.sendKeys(uname);
		pwd.sendKeys(passwrd);
		btnSignIn.click();
	}
}
