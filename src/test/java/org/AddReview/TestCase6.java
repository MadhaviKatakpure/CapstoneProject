package org.AddReview;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfigNormal;
import org.Review.ReviewComment;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestCase6 extends BaseConfigNormal{
	
	public ReviewComment reviewObj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		reviewObj=new ReviewComment(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		reviewObj.addReview();
	}

}
