package com.chaayostest_webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//********* LoginPage of Chaayos Application using POM Design Pattern***********//
//Maintain Locator and Method using POM Pattern//
public class Chaayos_LoginPage {
	WebDriver driver;
	@FindBy(xpath="//img[@class='menuIcon']") WebElement MenuIcon;
	@FindBy (xpath = "//div[text()='Login']") WebElement Loginmenu;
	@FindBy(xpath = "//input[@id='userContactInput']") WebElement usermob;
	@FindBy (xpath= "//div[text()='Login'][2]") WebElement clickLogin;
	@FindBy(xpath = "//input[@id='otpInput']")WebElement Otpcode;
	@FindBy (xpath = "//div[contains(text(),'Verify')]")WebElement OtpVerify;
	public Chaayos_LoginPage (WebDriver driver)
	{
		this.driver=driver;
		 
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickMenuIcon()
	{
		MenuIcon.click();
	}
	public void clickLogininMenu()
	{
		Loginmenu.click();
	}
	public void usermobile_number(String mobno)
	{
		usermob.sendKeys(mobno);
	}
	public void clickLoginButton()
	{
		clickLogin.click();
	}
	public void loginotpcode(String otp_code)
	{
		Otpcode.sendKeys(otp_code);
	}
	public void loging_otpverifybutton()
	{
		OtpVerify.click();
	}
	
	
	

}
