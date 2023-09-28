package oopsConcept;

public class CallABSClass extends ABSClass
{


	public void m2()
	{
		System.out.println("this is my credential");
		
	}

	public static void main(String[] args) {
		
		CallABSClass cabc = new CallABSClass();
		cabc.m1();
		cabc.m2();
		
	}
	
	
}
