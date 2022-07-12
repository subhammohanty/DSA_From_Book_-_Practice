package problem1_Stack;

import java.util.Stack;

public class ParenthesisCheck {
	
	public static void main(String[] args) {
		System.out.println(verify("(())"));
		
	}
	
	public static boolean verify(String s) {
		Stack<Character> stack = new Stack<Character>();
		if (s == null || s.length() == 0) {return true;}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {return false;}
			} else if (s.charAt(i) == ']') {
				if (!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else {return false;}
			} else if (s.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.peek() == '}') {
					stack.pop();
				} else {return false;}
			} else {
				stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty()) {return true;}
		else {return false;}
	}

}
