package problem3_LL;


public class InsertInASortedList {
	
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
	
	public Node isertInASorted(int data) {
		Node newNode = new Node();
		newNode.data = data;
		Node currentNode = head;
		Node tempNode = head;
		if(head == null) {
			return newNode;
		}
		while(currentNode != null && currentNode.data < data) {
			tempNode = currentNode;
			currentNode = currentNode.next;
		}
		newNode.next = currentNode;
		tempNode.next = newNode;
		return newNode;
		
	}

}
