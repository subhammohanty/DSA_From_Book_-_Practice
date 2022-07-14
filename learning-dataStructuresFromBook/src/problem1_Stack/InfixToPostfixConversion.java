package problem1_Stack;

import java.util.Stack;

public class InfixToPostfixConversion {

	public static void main(String[] args) {
		System.out.println(toPostfix("A/B-C+D*E-A*C"));
	}

	public static String toPostfix(String infix) {
		char symbol;
		StringBuilder postfix = new StringBuilder();
//		String postfix = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < infix.length(); i++) {
			symbol = infix.charAt(i);
			if (Character.isLetter(symbol)) {
				postfix.append(symbol);
			} else if (symbol == '(') {
				stack.push(symbol);
			} else if (symbol == ')') {
				while (stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && !(stack.peek() == '(') && prec(symbol) <= prec(stack.peek())) {
					postfix.append(stack.pop());
				}
				stack.push(symbol);
			}
		}
			while (!stack.isEmpty()) {
				postfix.append(stack.pop());
			}
		return postfix.toString();
	}

	public static int prec(char symbol) {
		if(symbol == '+' || symbol == '-') {
			return 1;
		}else if (symbol == '*' || symbol == '/' || symbol == '%') {
			return 2;
		}else {
			return 0;
		}
	}
}
