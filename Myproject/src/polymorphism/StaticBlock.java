package polymorphism;
/*
 * public class StaticBlock {
 * 
 * static int i; static { i=1; System.out.println("Static Block"); }
 * 
 * }
 */

public class StaticBlock {

	static int i;
	static {
		i=1;
		System.out.println("Static Block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticBlock.i);
}
}
