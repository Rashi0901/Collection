package july08.colection;

import java.util.ArrayList;

public class ArrayNew {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer> ();
		
		arr.add(50);
		arr.add(10);
		arr.add(40);
		arr.add(30);
		arr.add(20);
		
		System.out.println("Original Array:-");
		for(int p :arr) {
			System.out.println(p);
		}
		arr.sort(null);
		System.out.println("Modified Array:-");
		
		
		for(int o:arr) {
			
			System.out.println(o);
		}
		
		System.out.println("Reversed Array:-");
		
		
		for(int u:arr.reversed()) {
			System.out.println(u);
		}

	}

}
