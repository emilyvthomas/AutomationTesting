package pack;

public class Pallindrome {

 
	   public static void main(String args[]){

	      String str = "MALAYALAM";
	      StringBuilder buffer = new StringBuilder(str);
	      buffer.reverse();
	     
	      String str1 = buffer.toString();
	      if(str1.equals(str)){
	         System.out.println("String is palindrome");
	      }
	      else{
	         System.out.println("String is not palindrome");
	      }
	   }
	}