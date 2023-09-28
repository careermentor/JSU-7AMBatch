package org.xyz.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xyz.automation.fb.utilitiesClass.UtilitiesReadProp;

public class SignInPage 
{

	WebDriver driver;
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void click_Menu() throws Exception
	{
		driver.findElement(By.cssSelector(UtilitiesReadProp.readelement("Menu_css"))).click();
	}
	
	public void click_Signin() throws Exception
	{
		driver.findElement(By.xpath(UtilitiesReadProp.readelement("Sign_link_xpath"))).click();
	}
	
	public void enter_email(String uname) throws Exception
	{
		driver.findElement(By.id(UtilitiesReadProp.readelement("Sign_email_id"))).sendKeys(uname);
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
