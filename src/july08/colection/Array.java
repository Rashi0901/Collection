package july08.colection;

import java.util.ArrayList;
import java.util.Vector;

public class Array {
	public static void main(String[] args) {
		
	
	
	ArrayList<String> array = new ArrayList <String> ();
	
	array.add("Rashi") ;
	array.add("Rohit") ;
	array.add("Preeti") ;
	array.add("Pinki") ;
	array.add("Akansha") ;
	array.add("Amit") ;
	
	array.remove(3) ;
	
	
	for (String fruit: array) 
	
		System.out.println(fruit);
	
	Vector<String> p = new Vector<String>();
	
	p.add("Banana");
	p.add("Apple") ;
	p.add("Papaya") ;
	p.add("Grapes") ;
	System.out.println();
	for(String oo:p) {
		System.out.println(oo);
	}
	
	
	}
	
}
