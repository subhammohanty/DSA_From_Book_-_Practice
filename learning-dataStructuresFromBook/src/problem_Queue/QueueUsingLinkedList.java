package problem_Queue;

public class QueueUsingLinkedList {
	
	Node front = null;
	Node rear = null;
	
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void enQueue(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public void deQueue() {
		if(front == null) {
			System.out.println("Empty Queue");
		}else {
			front = front.next;
		}
	}
	
	public void display() {
		Node current = front;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
