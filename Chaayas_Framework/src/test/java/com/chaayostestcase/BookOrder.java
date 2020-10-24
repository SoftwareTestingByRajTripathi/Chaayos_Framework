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
		ch.selectCityFromCityOption();
		ch.select_Area();
		ch.selectDesiChai();
		ch.selectHaldiDoodh();
		ch.addToCart();
		ch.Mycart();
		ch.placeOrder();
		//ch.clickMenuIcon();
		//ch.clickLogininMenu();
		ch.usermobile_number("7838774492");
		ch.clickLoginButton();
		ch.loginotpcode("1234");
		ch.loging_otpverifybutton();
		ch.selectPaymentOption();
		ch.selectIciciBank();
		ch.ClickOnPaymentButton();
		ch.paymentSuccess();
		Assert.assertEquals(ch.getDesiChaiText(), ch.DESICHAI);
		Assert.assertEquals(ch.getHaldiDoodhText(), ch.HALDIDOODH);
		Assert.assertEquals(ch.getOrderSummaryPageTitle(), ch.ORDERSUMMARYPAGETITLE);
		
	}

}
