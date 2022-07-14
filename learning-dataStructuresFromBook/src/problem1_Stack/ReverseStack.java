package problem1_Stack;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		reverse(stack);
	}

	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int temp = stack.pop();
		reverse(stack);
		insertAtBottom(stack, temp);

		System.out.println(stack);
	}

	public static void insertAtBottom(Stack<Integer> stack, int data) {
		if (stack.isEmpty()) {
			stack.push(data);
			return;
		}

		int temp = stack.pop();
		insertAtBottom(stack, data);
		stack.push(temp);
	}

}
