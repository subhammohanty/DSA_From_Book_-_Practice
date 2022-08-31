package problem_leetCode_Stack;

import java.util.Stack;

public class Solution1 {
	
	public static void main(String[] args) {
		String str = "(()())(())";
		System.out.println(removeOuterParentheses(str));
	}
	
	public static String removeOuterParentheses(String s) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				if(stack.size() >= 1) {
					sb.append('(');
				}
				stack.push('(');
			}else {
				if(stack.size() > 1) {
					sb.append(s.charAt(i));
				}
				stack.pop();
			}
		}
		return sb.toString();
	}

}
