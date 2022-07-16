package problem_Queue;

public class QueueUsingLinkedListApp {
	
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		queue.display();
		
		queue.deQueue();
		
		System.out.println();
		queue.display();
		
	}

}
