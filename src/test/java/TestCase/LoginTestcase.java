package TestCase;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.LoginPageLocators;
import Operations.LoginPage;


public class LoginTestcase {
	WebElement login;

	@Test(priority=1)
	public void urlWindow()  {
	  LoginPage.openUrl();
	  LoginPage.verifyPageisDisplay(LoginPageLocators.loginBtn, "Login ");
		
	}

	@Test(priority=2)
	public void loginWindow() {
		LoginPage.verifyTextBoxField(LoginPageLocators.username, LoginPage.readpropertiesfile("username"));
		LoginPage.verifyTextBoxField(LoginPageLocators.password, LoginPage.readpropertiesfile("Pass"));
		LoginPage.clickOn(LoginPageLocators.loginBtn);
	    LoginPage.verifyPageisDisplay(LoginPageLocators.dashboardkeyword, "DarshBoard ");

		
	}
	
	

}
