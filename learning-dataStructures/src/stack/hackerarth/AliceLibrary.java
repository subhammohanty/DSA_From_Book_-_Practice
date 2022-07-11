package stack.hackerarth;

import java.util.Stack;

public class AliceLibrary {
	
	public static void main(String[] args) {
		System.out.println(demo("/u/love\\i\\"));
		
	}
	
	public static String demo(String str) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '/' || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				stack.push(str.charAt(i));
			} else {
				StringBuilder temp = new StringBuilder();
				while (stack.peek() != '/') {
					temp.append(stack.peek());
					stack.pop();
				}
				stack.pop();

				for (int j = 0; j < temp.length(); j++) {
					stack.push(temp.charAt(j));
				}
			}
		}
		StringBuilder ans = new StringBuilder();
		while (!stack.isEmpty()) {
			ans.append(stack.peek());
			stack.pop();
		}
		return ans.reverse().toString();
	}

}
