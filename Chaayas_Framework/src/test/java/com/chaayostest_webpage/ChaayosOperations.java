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

//*********  Chaayos Application using POM Design Pattern****************************//
//================Maintain all Locator and Method using POM Pattern=================//
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
	
	@FindBy (xpath= "//div[contains(text(),'Add to cart')]")
	WebElement Add_to_cart;
	
	@FindBy (xpath= "//span[contains(text(),'1')] ")
	WebElement mycart;
	@FindBy (xpath = "//div[contains(text(),'Place Order')]")
	WebElement placeOrder;
	@FindBy (xpath ="//*[@id='container']/div[2]/div[2]/div[5]/div")
	WebElement paymentOptions;
	@FindBy (xpath ="//div[text()='ICICI']") 
	WebElement SelectICICIBank;
	@FindBy (css="body:nth-child(2) div:nth-child(2) div:nth-child(1) div:nth-child(1) > div:nth-child(1)")
	WebElement payWithAamount;
	@FindBy (xpath="//div[contains(text(),'Desi Chai')]")
	WebElement Desi_Chai;
	@FindBy (xpath = "//div[contains(text(),' Haldi Doodh')]")
	WebElement Haldi_doodh;
	@FindBy (xpath = "//button[@class='Success']")
	WebElement Payemetsucess;
	
	public final String ORDERSUMMARYPAGETITLE="Chaayos - Order Chai Online - Experiments With Chai";
	
	public final String DESICHAI="Desi Chai";
	
	public final String HALDIDOODH=" Haldi Doodh";
	
	/*
	 * Created constructor
	 * @param: driver
	 */
	public ChaayosOperations(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*This method used to click DineIn RadioButton */
	public void clickDineIn(){
		wait.until(ExpectedConditions.elementToBeClickable(DineIn));		
		DineIn.click();
	}
	/*This Method used to Select city from list of City */
	public void selectCityFromCityOption(){
		Selectcity.click();
	}
	/*This method is used to select cafe Area from drop down menu */
	public void select_Area(){

		wait.until(ExpectedConditions.elementToBeClickable(areaDropDown));
		areaDropDown.click();
	}

	//public void clickMenuIcon(){
		//MenuIcon.click();
	//}
	
	//public void clickLogininMenu(){
		//Loginmenu.click();
	//}
	/*This method is used to select desi chai from prodcut list  */
	public void selectDesiChai(){
		
		for(int i=0; i<productName.size();i++){
			if(productName.get(i).getText().equals(DESICHAI)){
				DesiChai.click();
				break;
			}
		}
	}
	/*This method is used to select Haldi Doodh from prodcut list  */
	public void selectHaldiDoodh(){
		
		for(int i=0; i<productName.size();i++){
			if(productName.get(i).getText().equals(HALDIDOODH)){
				haldiDoodh.click();
				break;
			}
		}
	}
	/*This method is used to Product add  in under add to cart tab */
	public void addToCart(){
	Add_to_cart.click();
	
}
	/*This method is used to show the product list in cart tab */
	public void Mycart(){
		mycart.click();
}
	/*This Method is used to Place the order */
	public void placeOrder(){
		wait.until(ExpectedConditions.elementToBeClickable(placeOrder));
		placeOrder.click();
		
	}
	/*This Method is used to enter the mobile number in mobile number field during login with Mobile Number*/
	public void usermobile_number(String mobno)
	{
		wait.until(ExpectedConditions.elementToBeClickable(usermob));
		usermob.sendKeys(mobno);
	}
	/*This method is used to click login button after enter the mobile number*/
	public void clickLoginButton()
	{
		clickLogin.click();
	}
	/*This number is used to enter OPT received from mobile number */
	public void loginotpcode(String otp_code){
		wait.until(ExpectedConditions.elementToBeClickable(Otpcode));
		Otpcode.sendKeys(otp_code);
	}
	/*This Method is used to verify opt button */
	public void loging_otpverifybutton() throws IOException{
		OtpVerify.click();
		ScreenShots.screenShot(driver, "otpScreen");
	}
	/*This method is used to Select Payment option in Payment screen page*/
	public void selectPaymentOption(){
		wait.until(ExpectedConditions.elementToBeClickable(paymentOptions));
		paymentOptions.click();
	}
	/*This method is used to select ICICI bank from bank list*/
	public void selectIciciBank(){
		SelectICICIBank.click();
	}
	/*This method is used to payment button*/
	public void ClickOnPaymentButton() throws IOException{
		wait.until(ExpectedConditions.elementToBeClickable(payWithAamount));
		payWithAamount.click();
		ScreenShots.screenShot(driver, "payWithAamount");
		
	}
	/*This method is used to click payment success options*/
	public void paymentSuccess(){
		wait.until(ExpectedConditions.elementToBeClickable(Payemetsucess));
		Payemetsucess.click();
		
	}
	/*This method is used to Verify order summary page*/
	public String getOrderSummaryPageTitle(){
		return driver.getTitle();
	}
	/*This method is used to Verify product in cart page*/
	public String getDesiChaiText(){
		return Desi_Chai.getText(); 
	}
	
	public String getHaldiDoodhText(){
		return Haldi_doodh.getText();
	}
}
