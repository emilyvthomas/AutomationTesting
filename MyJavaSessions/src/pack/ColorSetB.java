package pack;


public class ColorSetB extends ColorSet{
	
	public void calculate(){
		System.out.println("child class");
		}
	
	public void print_color(){
		calculate();
		super.Calculate();
	}
	public static void main(String args[]) {
		ColorSetB b = new ColorSetB();
		b.print_color();
	}
}
