package pack;

public class Student {

	int rollno;
	String sname;
	
	public Student()
	{
	
		System.out.println("Default Constructor");
	}
	
	public Student(int rollno,String name) {
		this();
		System.out.println("Parameterised Constructor"+rollno+"\t"+name);
	}
	
public static void main(String[] args)
{
	Student S =new Student(1,"Ann");
	System.out.println("Main method");
}
}
