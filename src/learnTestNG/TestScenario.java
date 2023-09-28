package learnTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario 
{
	@Test
	public void first_testcase()
	{
		System.out.println("this is my first test case");
		
		Assert.assertEquals("Hello", "Hello");  //hard assertion
		
		System.out.println("this tc is executed");
		
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is my second test case");
		
		SoftAssert sa = new SoftAssert();    //soft assertion
		sa.assertEquals("hello", "Hello");  //soft assertion
		
		System.out.println("this tc is executed");  //print
		
		sa.assertAll();  //pass or fail
		
		WebDriver driver;
		//driver.findElement(by.)
		
	}
	
	@Test(enabled=false)
	public void third_testcase()
	{
		System.out.println("this is my third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is my forth test case");
	}
	
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is my fifth test case");
	}
	
	@Test(priority=-3)
	public void sixth_testcase()
	{
		System.out.println("this is my sixth test case");
	}
	
	@Test(priority=-2)
	public void seven_testcase()
	{
		System.out.println("this is my seven test case");
	}
	
	@Test(priority=-1)
	public void eight_testcase()
	{
		System.out.println("this is my eight test case");
	}
	
	
	/*  multi line comments
	
	public static void main(String[] args) 
	{
	
		TestScenario ts= new TestScenario();
		ts.first_testcase();
		
	}
	*/
	
}
