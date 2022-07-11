package ds.circularLinkedlist;

public class CircularLinkedListOwnImpl {
	
	Node head;
	Node tail;
	
	public CircularLinkedListOwnImpl() {
		this.head = null;
		this.tail = null;
	}
	
	public void display() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is Empty");
		}else {
			System.out.print("{");
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}while(temp != head);
			System.out.print("}");
		}
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}else {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(tail == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}else {
			tail.next = newNode;
			tail = newNode;
			newNode.next = head;
		}	
	}
	
	public void insertinPos(int data , int pos) {
		Node newNode = new Node();
		newNode.data = data;
		if(pos == 0) {
			insertFirst(data);
		}else {
			Node prev = head;
			for(int i =0; i<(pos-1); i++) {
				prev = prev.next;
			}
			newNode.next = prev.next;
			prev.next = newNode;
		}
	}
	
//	Delete Operations {First , Last , Middle}
	
	public Node deleteFirst() {
		Node temp = head;
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			head = temp.next;
			tail.next = head;
		}
		return temp;
	}
	
	public Node deleteLast() {
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			Node temp = head;
			Node prev = temp.next;
			while(prev.next != head) {
				temp = prev;
				prev = prev.next;
			}
			temp.next = head;
			tail = temp;
		}
		return null;
	}
	
	public Node deleteInPos(int pos) {
		if (pos == 0) {
			deleteFirst();
		}
		else {
			Node prev = head;
			for(int i = 0; i < (pos-1); i++) {
				prev = prev.next;
			}
			prev.next = prev.next.next;
		}
		return null;
	}


}
