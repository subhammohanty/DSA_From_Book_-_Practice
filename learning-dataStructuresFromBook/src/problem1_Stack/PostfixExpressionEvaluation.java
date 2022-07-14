package problem1_Stack;

import java.util.Stack;

public class PostfixExpressionEvaluation {
	
	public static void main(String[] args) {
		String [] token = {"1","2","3","*","+","5", "-"};
		System.out.println(postfixExpr(token));
	}
	
	public static int postfixExpr(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for(String token : tokens) {
			if(token == "+") {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op1+op2);
			}else if (token == "-") {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2-op1);
			}else if (token == "*") {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op1*op2);
			}else if (token == "/") {
				int op1 = stack.pop();
				int op2 = stack.pop();
				stack.push(op2/op1);
			}else {
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}

}
