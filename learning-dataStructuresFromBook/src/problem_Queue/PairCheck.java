package problem_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PairCheck {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.addAll(Arrays.asList(4,5,-2,-3,11,10,5,6,20));
		System.out.println(pairCheck(stack));
	}
	
	public static boolean pairCheck(Stack<Integer> stack) {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean isPaired = true;
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		while (!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		while(!stack.isEmpty()) {
			int n = stack.pop();
			queue.add(n);
			if(!stack.isEmpty()) {
				int m = stack.pop();
				queue.add(m);
				if(Math.abs(n-m) != 1) {
					isPaired = false;
				}
			}
		}
		return isPaired;
	}

}
