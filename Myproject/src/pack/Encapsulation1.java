package pack;

public class Encapsulation1 {
	private int rollno;
	private String name;
	public void setDatails(int rnum, String sname) {
		// TODO Auto-generated method stub
		rollno=rnum;
		name=sname;
	}
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Rollnum:"+rollno+"\t"+"Name :"+name);
	}
	

}
