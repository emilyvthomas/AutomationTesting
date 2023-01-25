package Assignment;
import java.util.*;
public class BubbleSort
{



  
  public void bubbleSort(int array[]) {
    int size = array.length;
    
    
    for (int i = 0; i < size - 1; i++)
 
      for (int j = 0; j < size - i - 1; j++)

       
        if (array[j] > array[j + 1]) {

          
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      
    int arr[] = { 13, 45, 20, 10, 1 };
    
    // call method using class name
    BubbleSort b=new BubbleSort();
b.bubbleSort(arr);
    
    System.out.println("Sorted Array is:");
      
    for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
  }
}
}