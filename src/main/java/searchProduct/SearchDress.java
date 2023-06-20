package searchProduct;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchDress {
	
	WebDriver driver;
	Actions act;
	
	public SearchDress(WebDriver driver)
	{
		this.driver=driver;
		this.act=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()=' Products']")
	public WebElement productButton;
	
	@FindBy(xpath="//h2[text()='All Products']")
	public WebElement allProduct;
	
	@FindBy(xpath="//input[@id='search_product']")
	public WebElement dressSearch;
	
	@FindBy(xpath="//button[@id='submit_search']")
	public WebElement search;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[1]")
	public WebElement dress1;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[3]")
	public WebElement dress2;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[5]")
	public WebElement dress3;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[7]")
	public WebElement dress4;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[9]")
	public WebElement dress5;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[11]")
	public WebElement dress6;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[13]")
	public WebElement dress7;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[15]")
	public WebElement dress8;
	
	@FindBy(xpath="(//a[text()='Add to cart'])[17]")
	public WebElement dress9;
	
	@FindBy(xpath="//button[text()='Continue Shopping']")
	public WebElement continueButton;
	
	@FindBy(xpath="//a[text()=' Cart']")
	public WebElement cartButton;
	
	@FindBy(xpath="//a[text()='Sleeveless Dress']")
	public WebElement product1;
	
	@FindBy(xpath="//a[text()='Stylish Dress']")
	public WebElement product2;
	
	@FindBy(xpath="//a[text()='Sleeves Top and Short - Blue & Pink']")
	public WebElement product3;
	
	@FindBy(xpath="//a[text()='Sleeveless Unicorn Patch Gown - Pink']")
	public WebElement product4;
	
	@FindBy(xpath="//a[text()='Cotton Mull Embroidered Dress']")
	public WebElement product5;
	
	@FindBy(xpath="//a[text()='Blue Cotton Indie Mickey Dress']")
	public WebElement product6;
	
	@FindBy(xpath="//a[text()='Long Maxi Tulle Fancy Dress Up Outfits -Pink']")
	public WebElement product7;
	
	@FindBy(xpath="//a[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']")
	public WebElement product8;
	
	@FindBy(xpath="//a[text()='Rose Pink Embroidered Maxi Dress']")
	public WebElement product9;
	
	@FindBy(xpath="//a[text()=' Signup / Login']")
	public WebElement signupLogin;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	public WebElement emailLogin;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement login;
	
	public void addDress() throws InterruptedException
	{
		productButton.click();
		allProduct.isDisplayed();
		dressSearch.sendKeys("Dress");
		search.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","");
		
		act.moveToElement(dress1).click().build().perform();
		continueButton.click();
		
		act.moveToElement(dress2).click().build().perform();
		continueButton.click();
		
		act.moveToElement(dress3).click().build().perform();
		continueButton.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,600)","");
		
		act.moveToElement(dress4).click().build().perform();
		continueButton.click();
		
		act.moveToElement(dress5).click().build().perform();
		continueButton.click();
	
		act.moveToElement(dress6).click().build().perform();
		continueButton.click();
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,550)","");
		
		act.moveToElement(dress7).click().build().perform();
		continueButton.click();
		
		act.moveToElement(dress8).click().build().perform();
		continueButton.click();
		
		act.moveToElement(dress9).click().build().perform();
		continueButton.click();
		
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,-1650)","");
		
		cartButton.click();
		
		Assert.assertTrue(product1.isDisplayed());
		Assert.assertTrue(product2.isDisplayed());
		Assert.assertTrue(product3.isDisplayed());
		Assert.assertTrue(product4.isDisplayed());
		Assert.assertTrue(product5.isDisplayed());
		Assert.assertTrue(product6.isDisplayed());
		Assert.assertTrue(product7.isDisplayed());
		Assert.assertTrue(product8.isDisplayed());
		Assert.assertTrue(product9.isDisplayed());
		
		signupLogin.click();
		
		emailLogin.sendKeys("1231@gmail.com");
		password.sendKeys("123");
		login.click();
		
		cartButton.click();
		Assert.assertTrue(product1.isDisplayed());
		Assert.assertTrue(product2.isDisplayed());
		Assert.assertTrue(product3.isDisplayed());
		Assert.assertTrue(product4.isDisplayed());
		Assert.assertTrue(product5.isDisplayed());
		Assert.assertTrue(product6.isDisplayed());
		Assert.assertTrue(product7.isDisplayed());
		Assert.assertTrue(product8.isDisplayed());
		Assert.assertTrue(product9.isDisplayed());
		}
	}
