package org.Capstone.PageObject;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountInformationPage {
	
WebDriver driver;
	
	public AccountInformationPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='id_gender2']")
	public WebElement radiobutton;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	public WebElement dayDropdown;
	
	@FindBy(xpath="//select[@id='months']")
	public WebElement monthDropdown;
	
	@FindBy(xpath="//select[@id='years']")
	public WebElement yearDropdown;
	
	@FindBy(xpath="//input[@id='newsletter']")
	public WebElement newsletterCheckbox;
	
	@FindBy(xpath="//input[@id='optin']")
	public WebElement specialOfferCheckbox;
	
	@FindBy(xpath="//input[@id='first_name']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='company']")
	public WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	public WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
	public WebElement address2;
	
	@FindBy(xpath="//select[@id='country']")
	public WebElement countryDropdown;
	
	@FindBy(xpath="//input[@id='state']")
	public WebElement state;
	
	@FindBy(xpath="//input[@id='city']")
	public WebElement city;
	
	@FindBy(xpath="//input[@id='zipcode']")
	public WebElement zipcode;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	public WebElement mobileNumber;
	
	@FindBy(xpath="//button[text()='Create Account']")
	public WebElement createAccount;
	
	@FindBy(xpath="//*[text()='Account Created!']")
	public WebElement accountCreatedText;
	
	@FindBy(xpath="//a[text()='Continue']")
	public WebElement continueButton;
	
	@FindBy(xpath="//a[text()=' Logged in as ']")
	public WebElement loggedInAsLink;
	
	@FindBy(xpath="//a[text()=' Delete Account']")
	public WebElement deleteAccount;
	
	@FindBy(xpath=" //*[text()='Account Deleted!']")
	public WebElement accountDeletedMessage;
	
	@FindBy(xpath="  //*[text()='Continue']")
	public WebElement deleteContinue;
	
	
	public void AccountCreation() throws InterruptedException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\PECM27\\Ecllipse\\Axis_Project\\src\\main\\java\\Config\\config.properties");
		Properties p = new Properties();
		p.load(file);
		String pass=p.getProperty("password");
		String fn =p.getProperty("Firstname");
		String ln =p.getProperty("LastName");
		String com =p.getProperty("company");
		String a1 =p.getProperty("address1");
		String a2 =p.getProperty("address2");
		String st =p.getProperty("state");
		String c =p.getProperty("city");
		String zc =p.getProperty("zipcode");
		String mn =p.getProperty("MobileNo");
		
		radiobutton.click();
		password.sendKeys(pass);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		Select day = new Select(dayDropdown);
		day.selectByVisibleText("21");
		
		Select month = new Select(monthDropdown);
		month.selectByVisibleText("February");
		
		Select year = new Select(yearDropdown);
		year.selectByVisibleText("1999");
		
		newsletterCheckbox.click();
		specialOfferCheckbox.click();
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		company.sendKeys(com);
		address1.sendKeys(a1);
		address2.sendKeys(a2);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,250)","");
		Select country = new Select(countryDropdown);
		country.selectByVisibleText("India");
		
		state.sendKeys(st);
		city.sendKeys(c);
		zipcode.sendKeys(zc);
		mobileNumber.sendKeys(mn);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,250)","");
		Thread.sleep(1000);
		createAccount.click();
		
		accountCreatedText.isDisplayed();
		continueButton.click();
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		continueButton.click();
		
		loggedInAsLink.isDisplayed();
		Thread.sleep(1000);
		deleteAccount.click();
		Thread.sleep(1000);
		accountDeletedMessage.isDisplayed();
		deleteContinue.click();
	
		
		
		
		
	}
	
	

}
