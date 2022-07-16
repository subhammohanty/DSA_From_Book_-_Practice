package problem_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));		
		System.out.println(queue);
		System.out.println(reverseOrder(4, queue));
	}

	
	public static Queue<Integer> reverseOrder(int k , Queue<Integer> queue){
		if(queue == null || k > queue.size()) {
			throw new IllegalArgumentException();
		}else if(k > 0) {
			Stack<Integer> stack = new Stack<Integer>();
			for(int i = 0; i < k; i++) {
				stack.push(queue.remove());
			}
			while(!stack.empty()) {
				queue.add(stack.pop());
			}
//			System.out.println(queue.remove());
//			queue.add(queue.remove());
			for(int i = 0; i <= k; i++) {
				queue.add(queue.remove());
			}			
		}
		return queue;
	}
}
