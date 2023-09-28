package org.xyz.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xyz.automation.fb.utilitiesClass.UtilitiesReadProp;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(UtilitiesReadProp.readelement("FB_login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(UtilitiesReadProp.readelement("FB_login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.xpath(UtilitiesReadProp.readelement("FB_login_login_bttn_xpath"))).click();
	}
}
