package Abstraction;

public class Display implements Printable1,Showable1 {
	
	public void print()
	{
		System.out.println("Print Method");
	}
	public void show()
	{
		System.out.println("Show Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable1 p=new Display();
		p.print();
		
		Showable1 s=new Display();
		s.show();
		
		Display d=new Display();
		d.print();
		d.show();
	}

}
