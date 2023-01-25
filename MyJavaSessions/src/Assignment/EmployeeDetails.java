package Assignment;

import java.util.Scanner;

public class EmployeeDetails {

	String empid;
	String empname;
	
	int basicsalary,Deduction,bonus;
	public void getDetails()
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the employee id");//taking all the inputs from the user
       empid=sc.next();
       System.out.println("Enter the employee name");
       empname=sc.next();
       System.out.println("Enter the basic salary of an employee");
       basicsalary=sc.nextInt();
       System.out.println("Enter the bonus of an employee");
       bonus=sc.nextInt();
       System.out.println("Enter the deduction amount from salary");
       Deduction=sc.nextInt();
}
}
class Employee extends EmployeeDetails
{
      float HRA,PF;
     public void calculate()
     {
    	 getDetails();
        HRA=(5/100)*basicsalary;
        PF=(20/100)*basicsalary;
        System.out.println("HRA :"+HRA);
        System.out.println("PF  :"+PF);
        
     }
}
class EmployeeSalary extends Employee
{
	int total;
     public void total()  //displaying the calculating parameters
     {
    	 calculate();
    	float total=basicsalary+HRA-PF-Deduction+bonus;
    	System.out.println("Total Salary of the Employe:"+total);
    	System.out.println(".........Employee Details...........");
        System.out.println("Employeeid  :  "+empid);
        System.out.println("Employename  :  "+empname);
        System.out.println("Employee basic salary :  "+basicsalary);
        System.out.println("HRA  :  "+HRA);
        System.out.println("PF  :  "+PF);
        System.out.println("Deduction  :  "+Deduction);
        System.out.println("Bonus recieved :  "+bonus);
        
     }
 

     public static void main(String args[])
     {
    	 EmployeeSalary employeobj=new EmployeeSalary();
         employeobj.total(); //calling read function
    
     }
}

