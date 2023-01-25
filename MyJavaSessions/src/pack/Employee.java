package pack;

public class Employee {
	
	int rollnum;
	String name;
	Address address;
	
	public Employee(int rollnum,String name, Address address) {
		this.rollnum=rollnum;
		this.name=name;
		this.address=address;
	}
	public void print()
	{
		System.out.println("Roll Number :"+rollnum);
		System.out.println("Name :"+name);
		System.out.println("City :"+address.city);
		System.out.println("State :"+address.state);
		System.out.println("Country :"+address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address a1=new Address("Kollam","Kerala","INDIA");
Address a=new Address("Kottayam","Kerala","INDIA");

Employee e1= new Employee(1,"Ann",a1);
Employee e2= new Employee(2,"Emily",a1);
Employee e3= new Employee(3,"Dona",a);
e1.print();
e2.print();
e3.print();

	}

}
