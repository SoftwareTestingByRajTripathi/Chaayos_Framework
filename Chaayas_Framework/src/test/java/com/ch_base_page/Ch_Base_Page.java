package com.ch_base_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//with the help of this class lunch the web browser and close it 
public class Ch_Base_Page {
	
	public WebDriver driver;
	@BeforeTest
		public void startBroser()//for browser lunch//
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Extramarks\\Desktop\\ChromeDriver86\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.extramarks.com/");
			driver.manage().deleteAllCookies();
		}
	@AfterTest
		public void closeBrowser()//for browser close
		{
			driver.close();
		}

	

}
