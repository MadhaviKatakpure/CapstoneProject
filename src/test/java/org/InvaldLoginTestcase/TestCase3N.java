package org.InvaldLoginTestcase;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigNormal;
import org.InvalidLogin.InvalidLoginPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3N extends BaseConfigNormal {
	
	public InvalidLoginPage InvalidObj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		InvalidObj = new InvalidLoginPage(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		InvalidObj.performInvalidLogin();
	}

	}


