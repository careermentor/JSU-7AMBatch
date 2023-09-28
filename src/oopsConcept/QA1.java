package oopsConcept;

public class QA1 
{
	
	int i =100;

	public  void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public void sum(int a, float b)  //10+10.5 = 20.5
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of 3 numbers: " + d);
	}
	
	public static void main(String[] args) 
	{
		QA1 q1 = new QA1();
		q1.sum(10, 20);
		q1.sum(10, 20.5f);
		
	}
	
}
