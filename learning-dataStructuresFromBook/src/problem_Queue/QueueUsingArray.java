package problem_Queue;

public class QueueUsingArray {
	
	int arr[];
	int capacity;
	int rear;
	
	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		rear = -1;
	}
	
	public void enQueue(int data) {
		if(rear == capacity - 1) {
			System.out.println("Queue is Full ");
		}
		rear++;
		arr[rear] =  data;
	}
	
	public int deQueue() {
		if(rear == -1) {
			System.out.println("Queue is Empty");
		}
		int result = arr[0];
		for(int i = 0; i < rear; i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		return result;
	}
	
	public int getPeek() {
		if(rear == -1) {
			System.out.println("Queue is Empty ");
		}
		int result = arr[0];
		return result;
	}

}
