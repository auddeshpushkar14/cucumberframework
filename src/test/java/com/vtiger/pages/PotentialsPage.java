package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.commonMethods;

public class PotentialsPage extends HeaderPage {
	
	
	
	public PotentialsPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver);
	}
	
	@FindBy(xpath="//input[@name='potentialname']")
	WebElement potentialname;
	
	@FindBy(xpath="//input[@title='Change']")
	WebElement change;
	
	@FindBy(xpath="//input[@name='closingdate']")
	WebElement closingdate;
	
	@FindBy(xpath="//input[@name='sales_stage']")
	WebElement sales_stage;
	
	@FindBy(xpath="//input[@name='button']")
	WebElement savebutton;
	
	public void CreatePotential(String pname,String accname, String closedate, String slaesstage, String linktext)
	{
		cm.enterValue(potentialname, pname, "potential name entered succesfully");
		cm.clickElement(change, "change button clicked");
		cm.switchtowindow(2, "Second window swiched");
		cm.clickDynamicLink(linktext, linktext+" link clicked");
		cm.switchtowindow(1, "first window swiched");
		cm.enterValue(closingdate, closedate, "close date entered succesfully");
		cm.selectDropdownText(sales_stage, slaesstage, "sales stage value selected successfully");
		cm.clickElement(savebutton, "Save button clicked");
	}
	
	

}
