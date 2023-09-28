package oopsConcept;

public abstract class ABSClass   //concrete class (default)
{

	
	public void m1()    //concrete method (default)
	{
		
		final int a = 200;
		//a=300;
		System.out.println("this is method1");
	}
	
	public abstract void m2();  //abstract method

	
	public static void main(String[] args)
	{
		//ABSClass abc = new ABSClass();
	}
}