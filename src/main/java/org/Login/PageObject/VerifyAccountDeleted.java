package org.Login.PageObject;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyAccountDeleted {
	
	WebDriver driver;
	
	public VerifyAccountDeleted(WebDriver driver)
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
	
	@FindBy(xpath="//a[text()=' Logged in as ']")
	public WebElement loggedInAsLink;
	
	@FindBy(xpath="//a[text()=' Logout']")
	public WebElement logout;
	
	
	
	public void AccountDeletedIsVisible() throws InterruptedException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\PECM27\\Ecllipse\\Axis_Project\\src\\main\\java\\Config\\config.properties");
		Properties p = new Properties();
		p.load(file);
		
		String email1=p.getProperty("email");
		String password1=p.getProperty("password");
		
		initialSignup.click();

		loginToAccount.isDisplayed();
		emailLogin.sendKeys(email1);
		password.sendKeys(password1);
		login.click();
		Thread.sleep(1000);
		
        loggedInAsLink.isDisplayed();
        Thread.sleep(2000);
		logout.click();
		
		
	}
	

}
