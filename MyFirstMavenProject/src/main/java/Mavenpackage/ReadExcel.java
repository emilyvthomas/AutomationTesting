package Mavenpackage;

import java.io.IOException;

public class ReadExcel {
	public static void main(String args[]) throws IOException
	{
		Excel1 obj = new Excel1();
		String a=obj.readData(0,0);
		System.out.println(a);
		String b=obj.readData(0,1);
		System.out.println(b);

	}

}

