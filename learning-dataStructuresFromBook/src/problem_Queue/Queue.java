package problem_Queue;

public class Queue {
	
	int[] data;
	int capacity;
	int front;
	int rear;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		data = new int[capacity];
		this.front = -1;
		this.rear = -1;
	}
	
	public void enQueue(int val) {
		if(rear == (capacity-1)) {
			System.out.println("Queue is full");
			return;
		}else if(rear == -1 && front ==-1) {
			rear = 0;
			front = 0;
			data[rear] = val;
		}else {
			rear = rear+1;
			data[rear] = val;
		}
	}
	
	
	public int deQueue() {
		if(front == -1 && rear == -1) {
			System.out.println("Empty Queue");
			return 0;
		}else {
			int result = data[front];
			front = front + 1;
			return result;
		}
	}
	
	public void display() {
		for(int i = front; i < rear; i++) {
			System.out.println(data[i]);
		}
		System.out.println(data[rear]);
	}
	
	public boolean isEmpty() {
		return front == capacity;
	}
	
	public boolean isFull() {
		return rear == (capacity - 1);
	}

}
