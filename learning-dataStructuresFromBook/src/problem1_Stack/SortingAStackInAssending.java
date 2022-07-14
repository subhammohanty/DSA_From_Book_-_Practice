package problem1_Stack;

import java.util.Stack;

public class SortingAStackInAssending {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(37);
		stack.push(23);
		stack.push(45);
		stack.push(11);
		System.out.println(sort(stack));
	}
	
	public static Stack<Integer> sort(Stack<Integer> stack){
		Stack<Integer> rStack = new Stack<Integer>();
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			while(!rStack.isEmpty() && rStack.peek() > temp) {
				stack.push(rStack.pop());
			}
			rStack.push(temp);
		}
		return rStack;
	}

}
