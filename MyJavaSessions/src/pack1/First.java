package pack1;

public class First {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	private void getMethod1()
	{
		System.out.println("Private Method");
	}
	protected void getMethod2()
	{
		System.out.println("Protected Method");
	}
	public void getMethod3()
	{
		System.out.println("Public Method");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			First f=new First();
			f.getMethod1();
			f.getMethod2();
			f.getMethod3();
			System.out.println(f.a);
			System.out.println(f.b);
			System.out.println(f.c);
			System.out.println(f.d);
			
			
	}
}

