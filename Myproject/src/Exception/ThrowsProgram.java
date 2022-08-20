package Exception;

import java.io.IOException;

public class ThrowsProgram {
	
	public void test3() throws IOException{
		throw new IOException("IO Exception");
		
	}
	public void test2() throws IOException{
		test3();
		
	}
	
	public void test1(){
		try {
		test2();
		
	}
		catch(Exception e) {
			System.out.println("Handled......");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThrowsProgram obj=new ThrowsProgram();
obj.test1();
	}

}


//https://youtu.be/Nr3LH-2ubCk
