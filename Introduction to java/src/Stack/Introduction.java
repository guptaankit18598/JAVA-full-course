package Stack;

import java.util.Stack;

public class Introduction {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
		s.push(33);
		s.push(35);
		s.push(55);
		int popped = s.pop();
		int peeked = s.peek();
		System.out.println(popped+" "+ peeked);
		 popped = s.pop();
		System.out.println(popped);
		
		
		
		
		
		
		
		
		
		

	}

}
