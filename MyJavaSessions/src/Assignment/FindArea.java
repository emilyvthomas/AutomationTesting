package Assignment;

import java.util.Scanner;

public class FindArea {


public static void main(String[] args) 
   {
	   double pi=3.14;
      Scanner sc = new Scanner(System.in);
      System.out.println("options");
      System.out.println("1.Area of circle");
      System.out.println("2.Area of square");
      System.out.println("3.Area of rectangle");
      System.out.println("Please enter any of the option: ");
      int num = sc.nextInt();
      switch(num)
      {
         case 1: System.out.println("Please enter radius of circle: ");
         double r = sc.nextFloat();
         double circlearea = (pi * r * r);
         System.out.println("Area of circle is: " + circlearea);
         break;
         case 2: System.out.println("Please enter the side: ");
         double side = sc.nextFloat();
         double squarearea = (side* side);
         System.out.println("Area of Square is: " + squarearea);
         break;
         case 3: System.out.println("Please enter length and breadth of rectangle: ");
         int length = sc.nextInt();
         int breadth = sc.nextInt();
         int Rectanglearea = length * breadth;
         System.out.println("Area of ractangle is: " + Rectanglearea);
         break;
       
         default:System.exit(0);
      }
     
   }
}