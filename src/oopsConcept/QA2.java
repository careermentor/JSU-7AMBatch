package oopsConcept;

public class QA2 extends QA1  //QA2 (Child)  --> QA1 (parent)
{
	int i = 30;  //global
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of 2 numbers: " + c);
	}
	

	public void sub(int a, int b)
	{
		final int i = 20;  //local
		//i=50;
		System.out.println(i); //20
		System.out.println(this.i);  //30
		System.out.println(super.i); //100
		
		super.sum(20, 30);  //20+30
		
		int c = a-b;
		System.out.println("subs of 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
		QA2 q2 = new QA2();
		q2.sub(40, 30);
		q2.sum(10, 20); //10*10+20*20
		
		
	}


	
	public void m1I() {
		// TODO Auto-generated method stub
	System.out.println("this is m1i");	
	}
	
}
