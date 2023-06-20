package org.SearchProduct;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigurationCapstone;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import searchProduct.SearchDress;

public class TestCase5 extends BaseConfigurationCapstone {
	
	public SearchDress searchObj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		searchObj= new SearchDress(driver);
		
    }
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		
		searchObj.addDress();;
     }


}
