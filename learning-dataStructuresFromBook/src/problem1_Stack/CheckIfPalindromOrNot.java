package problem1_Stack;

import java.util.Stack;

public class CheckIfPalindromOrNot {
	
	public static void main(String[] args) {
		System.out.println(isPalindrom("ababXbaba"));
	}
	
	public static boolean isPalindrom(String input) {
		char[] charArray = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		
		while(charArray[i] != 'X') {
			stack.push(charArray[i]);
			i++;
		}
		i++;
		while(i < input.length()) {
			if(stack.isEmpty()) {return false;}
			if(charArray[i] != stack.pop().charValue()) {
				return false;
			}
			i++;
		}
		return true;
	}

}
