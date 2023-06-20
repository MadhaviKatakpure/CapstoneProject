package org.Review;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewComment {
	
	WebDriver driver;
	
	public ReviewComment(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' Products']")
	public WebElement productButton;
	
	@FindBy(xpath="(//a[text()='View Product'])[2]")
	public WebElement viewProduct;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='review']")
	public WebElement review;
	
	@FindBy(xpath="//button[@id='button-review']")
	public WebElement submit;
	
	public void addReview() throws IOException
	{
		FileInputStream file = new FileInputStream("E:\\PECM27\\Ecllipse\\Axis_Project\\src\\main\\java\\Config\\config.properties");
		Properties p = new Properties();
		p.load(file);
		String name1=p.getProperty("name");
		String email1 = p.getProperty("email");
		String review1 = p.getProperty("review");
		
		
		productButton.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,450)","");
		
		viewProduct.click();
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,450)","");
		
		name.sendKeys(name1);
		email.sendKeys(email1);
		review.sendKeys(review1);
		submit.click();
		
		
		
		
	}

}
