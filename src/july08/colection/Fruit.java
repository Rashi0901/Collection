package july08.colection;

import java.util.ArrayList;

public class Fruit {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String> ();
		
		System.out.println("Original Array-");
		arr.add("Apple");
		arr.add("Banana");
		arr.add("Cherry");
		arr.add("Date");
		arr.add("Elderberry");
		
		for(int i=0 ; i<arr.size() ; i++) {
			
			System.out.println(arr.get(i));
		}
		System.out.println();
		System.out.println("New Array-");
		arr.remove(2) ;
		arr.add(2, "Fig");
		
		for(String o:arr) {
			System.out.println(o);
		}
		System.out.println();
		if (arr.contains("Banana")) {
			System.out.println("Yes it contain Banana");
		}
		
		arr.clear();
		
		
		System.out.println();
		System.out.println("Final Array:-"+arr);
		

	}

}
