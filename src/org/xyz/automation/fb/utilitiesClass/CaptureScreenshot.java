package org.xyz.automation.fb.utilitiesClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{


	
	public static void testresults(WebDriver driver, String name) throws Exception
	{
		
		TakesScreenshot scrpt =  (TakesScreenshot) driver;  //take a screenshot (prt SC)
	
		File f = scrpt.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Results/" + name + ".png");
		
		//int a = 20;
	//	System.out.println("this is value of a" + a + "this is a integer number");
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
