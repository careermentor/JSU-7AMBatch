package org.xyz.automation.fb.baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.xyz.automation.fb.utilitiesClass.UtilitiesReadProp;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws Exception
	{
		if(UtilitiesReadProp.readconfig("BrowserName").equalsIgnoreCase("CHROME"))
		{
			WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
			driver= new ChromeDriver();  //launch the chrome browser
		}
		
		else if(UtilitiesReadProp.readconfig("BrowserName").equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();  //inline chromer browser and chromedriver version
			driver= new EdgeDriver();  //launch the chrome browser
		}
		
		else
		{
			WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
			driver= new ChromeDriver();  //launch the chrome browser
		}
		
				
		driver.get(UtilitiesReadProp.readconfig("ApplicationURL"));   //upto 60 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
		
}
