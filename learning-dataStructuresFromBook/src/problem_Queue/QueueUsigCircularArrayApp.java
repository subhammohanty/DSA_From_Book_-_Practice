package problem_Queue;

public class QueueUsigCircularArrayApp {
	
	public static void main(String[] args) {
		
		QueueUsingCircularArray circulalArray = new QueueUsingCircularArray(5);
		circulalArray.enqueue(10);
		circulalArray.enqueue(20);
		circulalArray.enqueue(30);
		circulalArray.enqueue(40);
		circulalArray.enqueue(50);
		
		circulalArray.display();
		System.out.println();
		
		circulalArray.dequeue();
		circulalArray.display();
	}

}
