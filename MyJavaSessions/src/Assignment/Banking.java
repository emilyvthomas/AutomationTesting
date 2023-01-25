package Assignment;

import java.util.Scanner;

public class Banking {


   String accno;  
   String name;  
     
   long balance;  
    Scanner sc = new Scanner(System.in);  

public void deposit() {  
    long amountt;  
    System.out.println("Enter the amount to deposit: ");  
    amountt = sc.nextLong();  
    balance = balance + amountt;  
}  

public void withdrawal(int a) { 
	Banking.checkBalance();
	
    long amount;  
    System.out.println("Enter the amount  to withdraw: ");  
    amount = sc.nextLong();  
    if (balance >= amount) {  
        balance = balance - amount;  
        System.out.println("Balance after withdrawal: " + balance);  
    } else {  
        System.out.println("Your balance is less  \tinsufficient Balance...!!" );  
    
}

}

static int checkBalance()
{
	int amount=10000;
	        return amount;
	    
}
public static void main(String[] args) {
	
	Banking b=new Banking();
	int a=Banking.checkBalance();
	b.deposit();
	b.withdrawal(a);
	
}
}