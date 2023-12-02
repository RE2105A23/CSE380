/*
ArrayList
It is known as Dynamic Array
Index start at 1

How ArrayList is different between Vector?
*/

import java.util.List;
import java.util.ArrayList;


public class ArrayList1 {
	
	public static void main(String[] args) {
		
		//Creating ArrayList of Strings
		List<String> listA = new ArrayList<>();
		
		
		//Adding elments
		listA.add("Apple");
		listA.add("Bannana");
		listA.add("Cherry");
		
		//Accessing Elements
		String firstFruit=listA.get(0);
		System.out.println("First="+ firstFruit);
		
		//Update an element
		listA.set(1,"Orange");
		System.out.println("Updated="+listA);
		
		//Remove
		listA.remove(1);
		System.out.println("After removal at 1st index="+listA);
		
		//Size
		int s=listA.size();
		boolean i=listA.isEmpty();
		System.out.println("Size is="+ s+" "+ "is empty="+i);
		
		//Searching
		boolean c=listA.contains("Hello");
		System.out.println("Contains="+c); //False
		
		int d=listA.indexOf("Orange");
		System.out.println("Index of Orange="+d);
		
		
		//Iteration
		System.out.println("Iteration");
		listA.forEach(k->System.out.println(k));
		
		//Conversion to Array
		String[] array1=listA.toArray(new String[0]);
		
		for (String j:array1) {
			
			System.out.println("Array elements="+j);
		}
		
		//Sublist
		List<String> sub=listA.subList(0,2);//Where to start, how many elements
		System.out.println("Sublist=" + sub);
		
		//Adding elments
		listA.add("Apple1");
		listA.add("Bannaa1");
		listA.add("Cherry1");
		
		//Sort
		listA.sort((x,y)->x.compareTo(y));
		System.out.println("Sorted="+listA);
		
		//Cloning
		List<String> cloned1=(ArrayList<String>)((ArrayList<String>) listA).clone();
		System.out.println("Cloned="+cloned1);
		
	}
}