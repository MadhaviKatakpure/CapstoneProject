package org.Testcase;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigurationCapstone;

import org.Capstone.PageObject.AccountInformationPage;

import org.Capstone.PageObject.HomePage;
import org.Capstone.PageObject.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CapstoneTestcase extends BaseConfigurationCapstone{
	public HomePage homeObj;
	public SignUpPage signUpObj;
	public AccountInformationPage accountObj;

	WebDriver driver;

	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
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
