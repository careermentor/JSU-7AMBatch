package oopsConcept;

public class DemoKeywords 
{

	static int a  =30;
	
	public static void printval()
	{
		
		System.out.println(a);
	}
	
	public void printname()
	{
		System.out.println("this is method");
	}
	
	public static void main(String[] args) 
	{
		DemoKeywords dk = new DemoKeywords();
		dk.printname();
		
		DemoKeywords.printval();
		//DemoKeywords.printname();
	}
	
}
