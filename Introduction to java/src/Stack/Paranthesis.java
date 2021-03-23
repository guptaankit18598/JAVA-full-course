package Stack;

import java.util.Stack;
import java.util.Scanner;

public class Paranthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			String s = sc.nextLine();
	Stack<Character> stack = new Stack<>();
	    boolean isBalanced = true;
		for(int i = 0; i< s.length();i++) {
			char x = s.charAt(i);
			
			if(x == '(' || x=='{' || x=='[' ) {
				stack.push(x);
				continue;
			}
			if(stack.empty()) {
				isBalanced = false;
				break;
			}
				
					if(x == ')') {
						if(stack.peek() == '(') {
							stack.pop();
						} else {
							isBalanced = false;
							break;
						}
					}
					if(x == '}') {
						if(stack.peek() == '{') {
							stack.pop();
						} else {
							isBalanced = false;
							break;
						}
					}
					if(x == ']') {
						if(stack.peek() == '[') {
							stack.pop();
						} else {
							isBalanced = false;
							break;
						}
					}
		}
		
		if(!s.isEmpty()) {
			isBalanced = false;
		}
		if(isBalanced) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}
}
}


