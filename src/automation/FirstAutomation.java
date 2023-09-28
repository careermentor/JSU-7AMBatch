package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation 
{

	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://www.facebook.com/");   //upto 60 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	@Test(enabled=false)
	public void fbloginfunctionlity()
	{
		driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		//Home page - page title
		
	}
	
	@Test
	public void fbsignupfunctionlity() throws Exception
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();  //wait time is 0
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Java");
	}
	
}
