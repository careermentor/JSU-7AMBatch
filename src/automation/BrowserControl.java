package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserControl 
{

	WebDriver driver;
	
	@Test
	public void browsers() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
				
		//driver.close(); //close one window/tab
		driver.quit(); //multiple window/tab
	}
		
}
