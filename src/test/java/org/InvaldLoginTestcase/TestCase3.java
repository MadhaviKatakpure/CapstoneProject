package org.InvaldLoginTestcase;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigurationCapstone;


import org.InvalidLogin.InvalidLoginPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCase3 extends BaseConfigurationCapstone {
	
	
	public InvalidLoginPage InvalidObj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		
		InvalidObj = new InvalidLoginPage(driver);
		
    }
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		
		InvalidObj.performInvalidLogin();
		
		
	}

}
