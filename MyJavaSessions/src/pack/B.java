package pack;

public class B extends A{
	
	public void getB()
	{
		System.out.println("Print B");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.getA();
		obj.getB();

}
}