package ds.circularLinkedlist;

public class CircularLinkedList {
	
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}

	private boolean isEmpty() {
		return first==null;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public int deleteFirst() {
		int temp = first.data;
		if(first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}
	
//	public int deleteLast() {
//		int temp = last.data;
//		if(last.next == null) {
//			first = null;
//		}
//		last =
//}
	
	public void display() {
		System.out.println("List (first ---> last)");
		Node currentNode = first;
		while(currentNode != null) {
			currentNode.display();
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
}
