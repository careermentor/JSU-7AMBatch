package oopsConcept;

public class CallIDemo implements IDemo
{

	
	public void m3()
	{
		System.out.println("this is method3");
		
	}

	public static void main(String[] args) {
		CallIDemo ci = new CallIDemo();
		ci.m3();
	}
	
}


//class vs class - extends
//interface vs class - implements
//interface vs interface - extends