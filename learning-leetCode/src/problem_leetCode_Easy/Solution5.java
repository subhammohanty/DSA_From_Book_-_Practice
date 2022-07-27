package problem_leetCode_Easy;

import java.util.Stack;

public class Solution5 {
	
	public static void main(String[] args) {
		System.out.println(isValid("(]"));
	}
	
	 public static boolean isValid(String s) {
		 if(s == null) {return true;}
		 Stack<Character> stack = new Stack<Character>();
		 for(int i =0; i<s.length(); i++) {
			 if(s.charAt(i) == ')') {
				 if(!stack.isEmpty() && stack.peek() == '(') {
					 stack.pop();
				 }else {return false;}
			 }else if(s.charAt(i) == '}') {
				 if(!stack.isEmpty() && stack.peek() == '{') {
					 stack.pop();
				 }else {return false;}
			 }else if(s.charAt(i) == ']') {
				 if(!stack.isEmpty() && stack.peek() == '[') {
					 stack.pop();
				 }else {return false;}
			 }else {
				 stack.push(s.charAt(i));
			 }
		 }
		 if(stack.isEmpty()) {
			 return true;
		 }else {
			 return false;
		 }
		 
	 }

}
