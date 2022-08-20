
package Abstraction;

public class Display1 implements Showable {
		
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
		
		Display1 d1=new Display1();
		
		d1.print();
		d1.show();
		
		
	}

}
