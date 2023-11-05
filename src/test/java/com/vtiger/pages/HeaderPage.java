package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.commonMethods;

public class HeaderPage {
	
	public WebDriver driver;
	public commonMethods cm;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver);
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement lnkLogout;
	
	@FindBy(xpath="//a[text()='New Product']")
	WebElement lnkNewProduct;
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement lnkNewAccount;
	
	@FindBy(xpath="//a[text()='New Potential']")
	WebElement lnkNewPotential;
	
	@FindBy(xpath="//a[text()='New Quote']")
	WebElement lnkNewQuote;
	
	@FindBy(xpath="//a[text()='New Purchase Order']")
	WebElement lnkNewPurchseOrder;
	
	@FindBy(xpath="//a[@id='showSubMenu']")
	WebElement imgarrow;
	
	
	

	public void clickNewAccount()
	{
		
		cm.clickElement(lnkNewAccount, "New Account clicked");
	}
	public void clickNewPotential()
	{
		cm.clickElement(lnkNewPotential, "New Potential clicked");
	}
	
	
	public void clickNewQuote()
	{
		cm.clickElement(lnkNewQuote, "New Quote clicked");
	}
	
	public void clickNewPurchaseOrder()
	{
		cm.clickElement(lnkNewPurchseOrder, "New Purchase Order clicked");
	}
	
	public void verifyLogout()
	{
		cm.elementExist(lnkLogout, "Logout is dipslayed");
	}
	
	public void clickLogout()
	{
		cm.clickElement(lnkLogout, "Logout link clicked");
	}
	
	public void clickNewProduct()
	{
		cm.clickElement(lnkNewProduct, "New Product link clicked");
	}


}
