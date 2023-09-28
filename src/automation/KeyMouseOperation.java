package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyMouseOperation 
{

	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe page')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.testresults(driver, "handleFrames");
		
		driver.close();
	}
	
	@Test
	public void handleAlerts() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresults(driver,"handleAlerts");
		
		driver.close();
	}
	
	@Test(enabled=false)
	public void MouseControl() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
	//	act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Payments')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Payments')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		driver.switchTo().window(win1);
		
		
		
	}
	
	@Test(enabled=false)
	public void keyboardControl() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("user1");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		//act.sendKeys("user1").perform();
		
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass123").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
	}
		
}
