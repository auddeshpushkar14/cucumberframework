package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.commonMethods;

public class QuotePage extends HeaderPage {
	
	
	
	public QuotePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver);
	}

}
