package org.Testcase;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigNormal;

import org.Capstone.PageObject.AccountInformationPage;


import org.Capstone.PageObject.HomePage;
import org.Capstone.PageObject.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCaseN extends BaseConfigNormal {
	public HomePage homeObj;
	public SignUpPage signUpObj;
	public AccountInformationPage accountObj;
	WebDriver driver;
    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		
		homeObj = new HomePage(driver);
		signUpObj = new SignUpPage(driver);
		accountObj = new AccountInformationPage(driver);
		
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		homeObj.clickSignUp();
		signUpObj.performSignUp();
		accountObj.AccountCreation();
	}

	}




