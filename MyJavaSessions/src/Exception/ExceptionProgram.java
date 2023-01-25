package Exception;

public class ExceptionProgram {

	public static void main(String args[])
	{
		try {
			int a=10/0;
		}
		//catch(ArithmeticException e) {
		//	System.out.println("Arithmetic Exception found");
		//}
		catch(Exception e)
		{
			System.out.println(" Exception found");

		}
		
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("Statements Executed");
	}
	
}
