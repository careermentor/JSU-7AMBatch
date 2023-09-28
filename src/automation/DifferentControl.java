package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentControl 
{

	WebDriver driver;
	
	@Test
	public void browsers() throws Exception
	{
		WebDriverManager.chromedriver().setup();  //inline chromer browser and chromedriver version
		driver= new ChromeDriver();  //launch the chrome browser
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("fld_username")).sendKeys("Santosh");
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		WebElement genderob=  driver.findElement(By.name("sex"));
		
		
		Select gen = new Select(genderob);
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		
		Select con = new Select(driver.findElement(By.name("country")));
		//con.selectByVisibleText("India");
		con.selectByVisibleText("United States");
		
		//con.deselectAll();
		//con.selectByVisibleText("Nepal");
		
		//Thread.sleep(5000);
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		st.selectByVisibleText("Arizona");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Casas Adobes"));
		
		ct.selectByVisibleText("Fountain Hills");
		
		
		driver.findElement(By.name("terms")).click();
		
		//driver.findElement(By.className("displayPopup")).click();
		
	}
		
}
