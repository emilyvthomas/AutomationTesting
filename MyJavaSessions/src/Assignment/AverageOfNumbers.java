package Assignment;


public class AverageOfNumbers {


	 public static int findAverage(int a,int b ,int c){
		    return((a+b+c)/3);
	 }
	 
	 public static float findAverage(float a,float b,float c){
		    return((a+b+c)/3);
		      
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float avg1=AverageOfNumbers.findAverage( 2.5f,4.2f,6.8f);
		    int avg=AverageOfNumbers.findAverage(10, 20,30);
		    System.out.println("Average of integer numbers: "+avg);
		      System.out.println("Average of float numbers: "+avg1);
	}

}
