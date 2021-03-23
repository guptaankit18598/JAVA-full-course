package Stack;

import java.util.Scanner;
import java.util.Stack;

public class paranthesisCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
			String s = sc.next();
			
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
				if(x == '(') {
					if(stack.peek() == '(') {
						stack.pop();
					} else {
						isBalanced = false;
						break;
					}
				}
				if(x == '{') {
					if(stack.peek() == '{') {
						stack.pop();
					} else {
						isBalanced = false;
						break;
					}
				}
				if(x == '[') {
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
			
			if(!isBalanced) {
				System.out.println("Balanced");
			} else {
				System.out.println("Not Balanced");
			}
		
	}
	}
