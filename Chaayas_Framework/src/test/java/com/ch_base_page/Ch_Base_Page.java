package com.ch_base_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//with the help of this class lunch the web browser and close it //
public class Ch_Base_Page {
	
	public WebDriver driver;
	//==============for browser lunch==========================//
	@BeforeTest
		public void startBroser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Extramarks\\Desktop\\ChromeDriver86\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://54.169.58.110/");
			driver.manage().deleteAllCookies();
		}
	//===========================for browser close==================//
	@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}

	

}
