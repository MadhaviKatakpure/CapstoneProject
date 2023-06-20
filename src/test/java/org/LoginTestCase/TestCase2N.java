package org.LoginTestCase;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigNormal;

import org.Login.PageObject.VerifyAccountDeleted;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2N extends BaseConfigNormal {
	
	public VerifyAccountDeleted verifyObj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		verifyObj = new VerifyAccountDeleted(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		verifyObj.AccountDeletedIsVisible();
	}

	}
