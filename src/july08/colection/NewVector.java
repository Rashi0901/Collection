package july08.colection;

import java.util.Vector;

public class NewVector {
	
	public static void main(String[] args) {
		
		Vector<Integer> num = new Vector<Integer> ();
		
		num.add(10) ;
		num.add(20) ;
		num.add(30) ;
		num.add(40) ;
		num.add(50) ;
		System.out.println("Orignal Vector-");
		for(int p:num) {
			System.out.println(p);
		}
		System.out.println();
		System.out.println("Modified Vector-");
		num.remove(2);
		num.add(2, 35);
		
		for(int o:num) {
			System.out.println(o);
		}
		if(num.contains(40)) {
			System.out.println();
			System.out.println("Yes, 40 is present");
		}else {
			System.out.println("No, 40 is not present");
		}
		num.clear();
		System.out.println();
		
		System.out.println("Final Vector:-"+num);
		
	}

}
