package JavaBasics;

import java.util.ArrayList;//we have to import this library elements 

public class ArraylistConcept {

	public static void main(String[] args) {
		
		//IN the array concept we have to give the size of the array first, but 
		//where as Arraylist no
		ArrayList AR=new ArrayList();//we have to define the array  first
		AR.add(10);
		AR.add(30);
		System.out.println(AR.size());
		
		AR.add('k');
		AR.add(43.43);
		AR.add("KRISHNA");
		AR.add(true);
		System.out.println(AR.size());//AR.size is to know the size of array
		System.out.println(AR.get(5));//AR.get() is to print any given value
//IndexOutOfBoundsException System.out.println(AR.get(6));
		
//to print all the values in array use for loop
		for(int i=0;i<AR.size();i++)
		
		{System.out.println(AR.get(i));}
		
		ArrayList<Integer>AR1=new ArrayList<Integer>();
		AR1.add(30);
//we can call only integer variables no other data types variables are not processed
		ArrayList<Character>AR2=new ArrayList<Character>();
		AR2.add('k');
	

	}

}
