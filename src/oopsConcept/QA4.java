package oopsConcept;

public class QA4 extends QA2// implements QA3I  // (Child)  --> QA2 (parent) -> QA1 (grand parent)
{

	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("mul of 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
		QA4 q4 = new QA4();
		//q4.sub(40, 30);
		//q4.sum(10, 20);
		//q4.mul(20, 30);
		q4.div(40, 20);
		q4.q3m();
	}

	
	public void q3m() {
		System.out.println("this is m3 of qa3I");
		
	}
	
}
