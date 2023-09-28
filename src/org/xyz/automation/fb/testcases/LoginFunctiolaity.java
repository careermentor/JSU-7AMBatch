package org.xyz.automation.fb.testcases;

import org.testng.annotations.Test;
import org.xyz.automation.fb.baseClass.InitiateBrowser;
import org.xyz.automation.fb.pages.LoginPage;

public class LoginFunctiolaity extends InitiateBrowser
{

	@Test
	public void validateloginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
	}
	
}
