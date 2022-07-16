package problem_Queue;


import java.util.Stack;

public class ReverseAQueueUsingStack {
	
	public static void main(String[] args) {
		Queue queue = new Queue(4);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		
		queue.display();
		System.out.println();
//		queue.deQueue();
//		queue.deQueue();
//		System.out.println();
		queue.display();
		System.out.println();
		reverseQueue(queue).display();

	}
	
	public static Queue reverseQueue(Queue queue) {
		Stack<Integer> stack = new Stack<Integer>();
		Queue queue1 = new Queue(4);
		while (!queue.isEmpty()) {
			stack.push(queue.deQueue());
		}
		while (!stack.isEmpty()) {
			queue1.enQueue(stack.pop());
		}
		return queue1;
	}

}
