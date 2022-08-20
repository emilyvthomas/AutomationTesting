package pack;

public class ColorB extends ColorA{

	String color="Black";
	public void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorB b=new ColorB();
		b.printColor();

	}

}
