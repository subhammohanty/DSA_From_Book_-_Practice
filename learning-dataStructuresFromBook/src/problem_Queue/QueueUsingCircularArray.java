package problem_Queue;

public class QueueUsingCircularArray {
	
	int arr[];
	int n;
	int front = -1;
	int rear = -1;
	
	public QueueUsingCircularArray(int n) {
		this.n  = n;
		arr = new int[n];
	}
	
	public void enqueue(int data) {
		if((rear+1) % n == front) {
			System.out.println("Queue is Full");
		}
		if(front == -1 && rear ==-1) {
			front = 0;
			rear = 0;
			arr[rear] = data;
		}
		rear = (rear + 1) % n;
		arr[rear] = data;
	}
	
	public int dequeue() {
		if(front == -1 && rear == -1) {
			System.out.println("Queue is Empty");
		}
		int result = arr[front];
		if(front == rear) {
			front = rear = -1;
		}else {
			front = (front + 1) % n;
		}	
		return result;
	}
	
	public void display() {
//		System.out.print(arr[front]);
		for(int i = front; i != rear; i = (i+1)%n) {
			System.out.print(arr[i]);
		}
		System.out.print(arr[rear]);
	}

}
