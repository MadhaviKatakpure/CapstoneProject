package org.LoginTestCase;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigurationCapstone;

import org.Login.PageObject.VerifyAccountDeleted;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase2 extends BaseConfigurationCapstone {
	
	
	
	public VerifyAccountDeleted verifyObj;
	WebDriver driver;

	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		
		verifyObj = new VerifyAccountDeleted(driver);
		
    }
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		
		verifyObj.AccountDeletedIsVisible();
		
	}
	

}
