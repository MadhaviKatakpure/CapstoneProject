package org.RemoveFromCart;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigNormal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase4N extends BaseConfigNormal {
	
	public AddToCart addObj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		addObj= new AddToCart(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		addObj.addToCart();
	}

	}


