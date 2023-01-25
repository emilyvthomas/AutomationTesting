package polymorphism;

public class PrintStaticValue {


    final int j=10;
	static int i=10;
	
	public void run1()
	{
	//	j=30; cannot change value of final variable
		System.out.println(j);
	}
	static void run()
	{
		i=40;
		
		System.out.println(i);
		
	}

	public static void main(String args[])
			{
		PrintStaticValue pv=new PrintStaticValue(); //for printing or calling final/instance variable
		PrintStaticValue.run();// for calling static context
		pv.run1();
			}

}
