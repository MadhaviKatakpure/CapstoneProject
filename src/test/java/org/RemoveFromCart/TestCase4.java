package org.RemoveFromCart;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigurationCapstone;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase4 extends BaseConfigurationCapstone{
	
	public AddToCart addObj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		addObj= new AddToCart(driver);
		
	}
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		addObj.addToCart();
	}

}
