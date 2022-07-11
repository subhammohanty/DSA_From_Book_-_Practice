package problem3;

public class ReverseASingleLinkedList {
	
	public Node head;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(head==null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void deleteFirst() {
		Node current = head;
		head = current.next;
	}
	
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void reverseALinkedList() {
		Node current = head;
		Node prev = null;
		while(current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
	}

}
