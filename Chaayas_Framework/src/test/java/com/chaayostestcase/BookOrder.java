package com.chaayostestcase;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ch_base_page.Ch_Base_Page;
import com.chaayostest_webpage.ChaayosOperations;


public class BookOrder extends Ch_Base_Page
{
	ChaayosOperations ch;

	@Test
	public void bookOrderForTea() throws InterruptedException, IOException
	{
		ch= new ChaayosOperations(driver);
		ch.clickDineIn();
		Thread.sleep(3000);
		ch.selectCityFromCityOption();
		Thread.sleep(3000);
		ch.select_Area();
		ch.clickMenuIcon();
		Thread.sleep(3000);
		ch.clickLogininMenu();
		Thread.sleep(3000);
		ch.usermobile_number("7838774492");
		ch.clickLoginButton();
		ch.loginotpcode("1234");
		ch.loging_otpverifybutton();
		String ActualUrl = driver.getCurrentUrl();
		String exceptedUrl = "http://54.169.58.110/menu";
		Assert.assertEquals(exceptedUrl, ActualUrl);
		System.out.println("Login Sucessfully");
		
		ch.selecDesiChai();
		
	}

}
