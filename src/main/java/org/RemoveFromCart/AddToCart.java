package org.RemoveFromCart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	WebDriver driver;
	Actions act;
	
	public AddToCart (WebDriver driver)
	{
		this.driver=driver;
		this.act=new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//*[text()='Add to cart'])[1]")
	public WebElement product1;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[3]")
	public WebElement product2;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[5]")
	public WebElement product3;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[7]")
	public WebElement product4;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[9]")
	public WebElement product5;
	
	@FindBy(xpath="//*[text()='Continue Shopping']")
	public WebElement continueButton;
	
	@FindBy(xpath="//a[text()=' Cart']")
	public WebElement cartButton;
	
	@FindBy(xpath="(//i[@class='fa fa-times'])[1]")
	  public WebElement Remove1;
	  
	  @FindBy(xpath="//i[@class='fa fa-times'][1]")
	  public WebElement Remove2;
	  
	  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
	  public WebElement Remove3;
	  
	  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
	  public WebElement Remove4;
	  
	  @FindBy(xpath = "//a[@class='cart_quantity_delete']")
	  public WebElement Remove5;
	  
	  @FindBy(xpath = "//a[@class='cart_quantity_delete']")
	  public WebElement cartEmptyVisible;
	
	
	public void addToCart() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)","");
		
		act.moveToElement(product1).click().build().perform();
		continueButton.click();
		
		act.moveToElement(product2).click().build().perform();
		continueButton.click();

		act.moveToElement(product3).click().build().perform();
		continueButton.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,450)","");
		
		act.moveToElement(product4).click().build().perform();
        continueButton.click();

		act.moveToElement(product5).click().build().perform();
		continueButton.click();
		
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,-900)","");
		
		cartButton.click();
		
		Remove1.click();
		Thread.sleep(2000);
		Remove2.click();
		Thread.sleep(2000);
		Remove3.click();
		Thread.sleep(2000);
		Remove4.click();
		Thread.sleep(2000);
		Remove5.click();


	}	
	
}
