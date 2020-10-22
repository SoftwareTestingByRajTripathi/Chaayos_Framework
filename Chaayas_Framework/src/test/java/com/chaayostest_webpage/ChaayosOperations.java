package com.chaayostest_webpage;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.chaayos_utility.ScreenShots;

//********* LoginPage of Chaayos Application using POM Design Pattern***********//
//================Maintain Locator and Method using POM Pattern=================//
public class ChaayosOperations{
	WebDriver driver;

	WebDriverWait wait=new WebDriverWait(driver, 20);

	@FindBy(xpath = "//label[text()='Dine In']") 
	WebElement DineIn;

	@FindBy (xpath ="//div[contains(text(),'New Delhi')]")
	WebElement Selectcity;

	@FindBy(xpath="//img[@class='menuIcon']")
	WebElement MenuIcon;

	@FindBy (xpath = "//div[text()='Login']") 
	WebElement Loginmenu;

	@FindBy(xpath = "//input[@id='userContactInput']") 
	WebElement usermob;
	
	@FindBy (xpath= "//div[text()='Login'][2]")
	WebElement clickLogin;
	
	@FindBy(xpath = "//input[@id='otpInput']")
	WebElement Otpcode;
	
	@FindBy (xpath = "//div[contains(text(),'Verify')]")
	WebElement OtpVerify;
	
	@FindBy (css = "#react-select-3--value > div.Select-placeholder")
	WebElement areaDropDown;

	@FindBy (xpath = "//div[@class='productDetail']")
	ArrayList<WebElement> productName;
	
	@FindBy (xpath ="//*[@id='MilkChai']/div[2]/div[6]/div[2]/div[2]/div[3] ")
	WebElement DesiChai;
	@FindBy (xpath = "//*[@id='MilkChai']/div[2]/div[5]/div[2]/div[2]/div[2]/span")
	WebElement haldiDoodh;
	
	/*
	 * Created constructor
	 * @param: driver
	 */
	public ChaayosOperations(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickDineIn(){
		DineIn.click();
	}
	
	public void selectCityFromCityOption(){
		Selectcity.click();
	}
	
	public void select_Area(){

		wait.until(ExpectedConditions.elementToBeClickable(areaDropDown));
		areaDropDown.click();
	}

	public void clickMenuIcon(){
		MenuIcon.click();
	}
	
	public void clickLogininMenu(){
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
	public void loginotpcode(String otp_code){
		Otpcode.sendKeys(otp_code);
	}
	
	public void loging_otpverifybutton() throws IOException{
		OtpVerify.click();
		ScreenShots.screenShot(driver, "otpScreen");
	}
	
	public void selecDesiChai(){
		
		for(int i=0; i<productName.size();i++){
			if(productName.get(i).getText().equals("Desi Chai")){
				DesiChai.click();
				break;
			}
		}
	}

public void selecHaldiDoodh(){
		
		for(int i=0; i<productName.size();i++){
			if(productName.get(i).getText().equals("Haldi Doodh")){
				haldiDoodh.click();
				break;
			}
		}
	}

}
