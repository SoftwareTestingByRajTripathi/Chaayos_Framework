package com.chaayos_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	
	public static void screenShot(WebDriver driver, String screenshotName) throws IOException
	 // passing WebDriver 'driver' element and screenshotName
	{
	// TakesScreenshot is an interface, casting it with WebDriver element
	TakesScreenshot ts=(TakesScreenshot)driver;
	// Saving screenshot in File Type 
	File source=ts.getScreenshotAs(OutputType.FILE); 
	 //Providing the source and destination location for screenshot//
	FileUtils.copyFile(source, new File("./ScreenShot/"+screenshotName+".png"));
	}
}
