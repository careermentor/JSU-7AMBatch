package org.xyz.automation.fb.datagenewrators;

import org.testng.annotations.DataProvider;

public class TestDataGen 
{

	@DataProvider(name="staticdata")
	public Object[][] testdataGenerator()
	{
		//String Data = "User1";
		//Object[] dat1 = {"user1","pass1"};   
		Object[][] dat2 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  
		return dat2;
	}
	
}
