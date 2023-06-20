package org.InvalidLogin;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginPage {
	WebDriver driver;
	
	public InvalidLoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' Signup / Login']")
	public WebElement initialSignup;
	
	@FindBy(xpath="//h2[text()='Login to your account']")
	public WebElement loginToAccount;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	public WebElement emailLogin;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement login;
	
	@FindBy(xpath="//*[text()='Your email or password is incorrect!']")
	public WebElement errorMessage;
	
	public void performInvalidLogin() throws IOException
	{
		
		
		initialSignup.click();
		loginToAccount.isDisplayed();
		emailLogin.sendKeys("12@gmail.com");
		password.sendKeys("12");
		login.click();
		errorMessage.isDisplayed();
		
	}

}
