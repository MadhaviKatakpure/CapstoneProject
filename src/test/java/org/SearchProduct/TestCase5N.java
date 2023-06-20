package org.SearchProduct;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigNormal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import searchProduct.SearchDress;

public class TestCase5N extends BaseConfigNormal {
	
	public SearchDress searchObj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		searchObj= new SearchDress(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		searchObj.addDress();;
	}

}
