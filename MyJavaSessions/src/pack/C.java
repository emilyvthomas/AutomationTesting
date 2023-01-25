package pack;

public class C extends B{
	
	public void getC()
	{
		System.out.println("Print C");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		obj.getA();
		obj.getB();
		obj.getC();

}
}