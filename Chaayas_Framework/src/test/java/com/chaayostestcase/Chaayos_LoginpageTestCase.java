package com.chaayostestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ch_base_page.Ch_Base_Page;
import com.chaayostest_webpage.Chaayos_LoginPage;

public class Chaayos_LoginpageTestCase extends Ch_Base_Page
{
	Chaayos_LoginPage Ch_Loginpage;
	@Test
	public void chaayos_Application_login() throws InterruptedException
	{
		Ch_Loginpage = new Chaayos_LoginPage(driver);
		Ch_Loginpage.clickDineIn();
		Thread.sleep(3000);
		Ch_Loginpage.selectcityfromcityOption();
		Thread.sleep(3000);
		Ch_Loginpage.clickMenuIcon();
		Thread.sleep(3000);
		Ch_Loginpage.clickLogininMenu();
		Thread.sleep(3000);
		Ch_Loginpage.usermobile_number("7838774492");
		Ch_Loginpage.clickLoginButton();
		Ch_Loginpage.loginotpcode("1234");
		Ch_Loginpage.loging_otpverifybutton();
		String ActualUrl = driver.getCurrentUrl();
		String exceptedUrl = "http://54.169.58.110/menu";
		Assert.assertEquals(exceptedUrl, ActualUrl);
		System.out.println("Login Sucessfully");
		
	}

}
