package oopsConcept;

public class QA3 extends QA1  //QA3 (Child)  --> QA2 (parent) -> QA1 (grand parent)
{

	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("mul of 2 numbers: " + c);
		
		String x = "hello";
		String y = "Hello";
		
		
	}
	
	public static void main(String[] args) 
	{
		QA3 q3 = new QA3();
		//q3.sub(40, 30);
		q3.sum(10, 20);
		q3.mul(20, 30);
		
	}
	
}
