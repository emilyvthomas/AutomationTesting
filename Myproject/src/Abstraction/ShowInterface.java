package Abstraction;

public class ShowInterface implements PrintInterface{

	public void print()
	{
		System.out.println("Printing...");
	}
	
	public void show()
	{
		System.out.println("Show Interface");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowInterface s=new ShowInterface();
		s.print();
		s.show();
		
		PrintInterface p=new ShowInterface();
		p.print();
		
	}

}
