package pack;

public class Student {

	int rollno;
	String sname;
	static String cname="LMCST";
	
//	public Student()
	//{
	
	//	System.out.println("Default Constructor");
	//}
	
	public Student(int rollno,String name,String cname ){
		
		//this();
		System.out.println("Student Details:" );
	System.out.println("Rollno :" + rollno + "\t" +"Name :"+ name +"\t"+"CollegeName: " +cname);
	}
	
public static void main(String[] args)
{
	Student S1 =new Student(1,"Ann",cname);
	Student S2 =new Student(2,"Emily",cname);
	
}
}
