package Assignment;


public class StudentTotal {
	
	int mark1,mark2,mark3,total,rollno;
	String name;
	public StudentTotal(int m1, int m2, int m3, int rnum, String sname ){
		
		
		mark1=m1;
		mark2=m2;
		mark3=m3;
		rollno=rnum;
		name=sname;
		
		
	}
	
	public void getTotal()
	{
		System.out.println("Roll Number :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Mark1 :"+mark1);
		System.out.println("Mark2 :"+mark2);
		System.out.println("Mark3 :"+mark3);
		total=mark1+mark2+mark3;
		System.out.println("Total Mark :"+total);
		calGrade(total);
		
	}
	public void calGrade(int m)
	{
		if(total>200)
		{
			System.out.println("Grade is A");
		}
		else
		{
			System.out.println("Grade is B");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTotal st=new StudentTotal(90,95,80,1,"Anju");
		StudentTotal s=new StudentTotal(10,90,80,1,"Ann");
		
		st.getTotal();
		s.getTotal();
		
		

	}

}
