package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.commonMethods;


public class LoginPage {
	
	public WebDriver driver;
	public commonMethods cm;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;		
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver);
	}
	
	
	
	@FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='Login']")
	WebElement login;
	
	String logo = "//img[@src='include/images/vtiger-crm.gif']";
	
	String errmsg = "//*[contains(text(),'You must specify a valid username and password.')]";
	
	
	//String tb_username = "//input[@name='user_name']";
	
	//By tb_pwd = By.xpath("//input[@name='user_password']");
	
	
	//WebElement elm = driver.findElement(By.xpath("//input[@name='Login']"));
	
	
	public void login(String userid, String pwd)
	{
		cm.enterValue(username, userid, "username entered successfully");
		
		cm.enterValue(password, pwd, "Password entered succesfully");
		cm.clickElement(login, "Login button clicked");
	}
	
	public void verifyLogo()
	{
		cm.elementExist(logo, "Logo is dipslayed");
	}
	
	public void verifyErrorMsg()
	{
		cm.elementExist(errmsg, "Error message displayed");
		System.out.println("Done");
	}
	


}
