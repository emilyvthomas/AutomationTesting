package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> list =new ArrayList();

		//list methods
list.add("Ann");
list.add("Emily");
list.add("Minnu");
list.add("Srihari");
System.out.println(list);

//to get the ist elements

String get=list.get(0);
String  get1=list.get(3);
System.out.println(get + "/t" + get1);

//list contains

boolean b=list.contains("Emily");
System.out.println(b);

//list remove
list.remove(2);

//list size

int s=list.size();
System.out.println(s);
	


	Iterator <String> itr=list.iterator();
	while(itr.hasNext()) {
		String i=itr.next();
		System.out.println(i);
		
	}
	
	for(String str : list)
	{
		System.out.println(str);
	}
	
	int arr[]=new int[2];
	arr[0]=1;
	arr[1]=2;
	
	for(int j:arr)
	{
		System.out.println(j);
	}
	
}
}
