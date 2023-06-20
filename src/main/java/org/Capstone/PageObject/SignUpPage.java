package org.Capstone.PageObject;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
WebDriver driver;
	
	public SignUpPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='New User Signup!']")
	public WebElement verifyNewUser;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement name;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	public WebElement emailSignup;
	
	@FindBy(xpath="//button[text()='Signup']")
	public WebElement signUp;
	
     public static String email() {
    	
    	String emailId = "";
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	while (emailId.length() < 5) {
    	int character = (int) (Math.random() * 26);
    	emailId += alphabet.substring(character, character + 1);
    	emailId += Integer.valueOf((int) (Math.random() * 99)).toString();
    	emailId += "@" + "gmail"+".com";
    	
    	

      }
    	return emailId;
    	}
	
	public void performSignUp() throws IOException
	{
		String emailId = email();
		FileInputStream file = new FileInputStream("E:\\PECM27\\Ecllipse\\Axis_Project\\src\\main\\java\\Config\\config.properties");
		Properties p = new Properties();
		p.load(file);
		String name1=p.getProperty("name");
		
		
		verifyNewUser.isDisplayed();
		name.sendKeys(name1);
		emailSignup.sendKeys(emailId);
		signUp.click();
		
	}

}
