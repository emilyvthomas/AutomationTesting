package Assignment;

public class LinearSearch {

	  
	   public static void main(String args[])
	   {
	      int i,num=90;
	      int a[]={10,40,70,90,100};     
	      for (i= 0; i < a.length; i++)
	      {
	         if (a[i] == num) 
	         {
	           System.out.println(num+" is found at location "+(i));
	           break;
	         }
	         else
	         {
	        	 System.out.println(num + " not found in array.");
	         }
	      }
	     
	   }
}