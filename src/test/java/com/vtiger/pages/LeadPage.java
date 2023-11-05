package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.commonMethods;

public class LeadPage extends HeaderPage {
	
	
	
	public LeadPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver);
	}

}
