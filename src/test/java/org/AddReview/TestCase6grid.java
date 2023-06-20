package org.AddReview;


import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigurationCapstone;
import org.Review.ReviewComment;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestCase6grid extends BaseConfigurationCapstone {
	public ReviewComment reviewObj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		reviewObj=new ReviewComment(driver);
		
    }
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		
		reviewObj.addReview();
     }

}
