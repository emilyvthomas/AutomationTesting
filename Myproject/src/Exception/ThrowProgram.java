package Exception;

public class ThrowProgram {
	
	public void print1()
	{
		print2();
	}
	public void print2()
	{
		try {
		print3();
		
	}
		catch(ArithmeticException e) {
			System.out.println("Handle Exception by print2");
		}
	}
	public void print3()
	{
		int a=10/0;
		throw new ArithmeticException();
		
		
	}
	
	public static void main(String args[])
	{
		ThrowProgram tp=new ThrowProgram();
		tp.print1();
		/*
		 * try{ tp.print3();
		 * 
		 * } catch(ArithmeticException e) { System.out.println("Handled by print3"); }
		 */
	}
}
