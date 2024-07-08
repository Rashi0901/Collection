package july08.colection;

import java.util.Stack;

public class StackNew {
	
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(10);
		System.out.println("Stack After Pushing 10 :- "+ st);
		st.push(20);
		System.out.println("Stack After Pushing 20 :- "+st);
		st.push(30);
		System.out.println("Stack After Pushing 30 :- "+st);
		st.push(40);
		System.out.println("Stack After Pushing 40 :- "+st);
		st.push(50);
		System.out.println("Stack After Pushing 50 :- "+ st);
		
		
		
		
		
		System.out.println("Popped Element: "+st.pop());
		
		System.out.println();
		System.out.println("Top Element: "+st.peek());
		
		System.out.println();
		if (st.isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println(
					"Stack is not Empty");
		}
		
		st.clear();
		System.out.println();
		System.out.println("After Clearing: "+ st);
		
		
		
	}

}
