package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataRuntime 
{

	WebDriver driver;
	
	@Test
	public void browsers() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
		driver= new ChromeDriver();  //launch the chrome browser
		//driver.navigate().to("https://www.facebook.com/");
		
		String expURL = "https://www.facebook.com/";
		
		driver.get(expURL);
		
		String actURL = driver.getCurrentUrl();//fetch the url from automation
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actURL, expURL);  //comparison  //hard assertion
		
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUname = "Email address or phone number";
		String ActUName = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUName);
		
		sa.assertEquals(ActUName, ExpUname);
		
		String ExpLoginbttn = "Log in";
		String ActLoginbttn = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginbttn);
		
		sa.assertEquals(ActLoginbttn, ExpLoginbttn);
		
		
		Point loclogin = driver.findElement(By.name("login")).getLocation();
		System.out.println(loclogin);
		
		//System.out.println(driver.getPageSource());
		
		boolean actstatelogin = driver.findElement(By.name("login")).isEnabled();
		sa.assertEquals(actstatelogin, true);
		
		System.out.println(driver.findElement(By.name("login")).isEnabled());
		
		sa.assertAll();
		
		driver.close();
	}
		
}
