package Assignment;

//Assignment 34 :Reverse of a Number
public class ReverseOfNumber {

	int reverse=0;
	int num;
	public ReverseOfNumber(int num) {
		
		this.num=num;
		
		while(num!=0)
		{
			reverse=(reverse*10)+(num%10);
		num=num/10;
		}
		System.out.println("Reverse of the Given Number is:"+reverse);	
		
		
	}

	
	public ReverseOfNumber() {
		this(1234);
		System.out.println("Finding Reverse");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOfNumber rv=new ReverseOfNumber();
		

	}

}
