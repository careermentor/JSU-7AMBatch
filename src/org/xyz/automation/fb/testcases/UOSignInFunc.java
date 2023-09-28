package org.xyz.automation.fb.testcases;

import org.testng.annotations.Test;
import org.xyz.automation.fb.baseClass.InitiateBrowser;
import org.xyz.automation.fb.pages.SignInPage;

import automation.CaptureScreenshot;

public class UOSignInFunc extends InitiateBrowser
{

	@Test
	public void validatesigninfunc() throws Exception
	{
		SignInPage sign = new SignInPage(driver);
		sign.click_Menu();
		sign.click_Signin();
		sign.enter_email("user1");
		
		CaptureScreenshot.testresults(driver, "validatesigninfunc");
		
	}
	
}
