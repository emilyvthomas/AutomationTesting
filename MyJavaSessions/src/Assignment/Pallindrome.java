package Assignment;


public class Pallindrome {
	   public static void main(String args[]){
	      String str = "MALAYALAM";
	      String str1="java";
	      StringBuffer buffer = new StringBuffer(str);
	      StringBuffer buffer1 = new StringBuffer(str1);
	      buffer1.reverse();
	      buffer.reverse();
	      String str2 = buffer.toString();
	      String str3 = buffer1.toString();
	      if(str2.equals(str) || str3.equals(str) )
	{
	         System.out.println("String is palindrome");
	                      }
	      else{
	         System.out.println("String is not palindrome");
	      }
	   }
	}
