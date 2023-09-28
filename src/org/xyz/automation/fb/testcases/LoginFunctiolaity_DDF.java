package org.xyz.automation.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.xyz.automation.fb.baseClass.InitiateBrowser;
import org.xyz.automation.fb.datagenewrators.TestDataGen;
import org.xyz.automation.fb.pages.LoginPage;

public class LoginFunctiolaity_DDF extends InitiateBrowser
{

	@Test(dataProvider="staticdata",dataProviderClass=TestDataGen.class)
	public void validateloginfunc(String urname, String passwrd) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(urname);
		login.enter_password(passwrd);
		login.click_loginbttn();
	}
	
	
	
	
}
