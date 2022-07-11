package ds.doublylinkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	
	public void display() {
		if(head == null) {
			System.out.println("List is Empty !!!");
		}else {
			Node temp = head;
			System.out.print("{");
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			
			System.out.print("}");
		}
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(tail == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public void insertInPos(int data , int pos) {
		Node newNode = new Node();
		newNode.data = data;
		if(pos == 0) {
			insertFirst(data);
		}else {
			Node prev = head;
			for(int i = 0; i <  (pos-1); i++) {
				prev = prev.next;
			}
			newNode.next = prev.next;
			newNode.prev = prev;
			prev.next = newNode;
		}
	}
	
	public void deleteFirst() {
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			Node temp = head;
			head = temp.next;
			head.prev = null;
		}
	}
	
	public void deleteLast() {
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			Node temp = tail;
			tail = temp.prev;
			tail.next = null;
			
		}
	}
	
	public void deleteInPos(int pos) {
		if(pos == 0) {
			deleteFirst();
		}else {
			Node temp = head;
			Node prev = temp.next;
			for(int i = 0; i < (pos- 1); i++) {
				temp = prev;
				prev = prev.next;
			}
			temp.next = prev.next;
			prev.next.prev = temp;
			
		}
	}
}
