package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.commonMethods;

public class AccountPage extends HeaderPage {
	
	
	
	public AccountPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver);
	}
	
	
	@FindBy(xpath="//input[@name='accountname']")
	WebElement accountname;
	
	@FindBy(xpath="//input[@name='button']")
	WebElement savebutton;
	
	public void CreateAccount(String accname)
	{
		cm.enterValue(accountname, accname, "Account Name entered succesfully");
		cm.clickElement(savebutton, "Save button clicked");
	}
	
	

}
