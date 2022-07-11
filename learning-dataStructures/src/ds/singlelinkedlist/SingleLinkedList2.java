package ds.singlelinkedlist;

public class SingleLinkedList2 {
	
	Node first;
	
	public void insert(Node head , int data , int pos) {
		Node newNode = new Node();
		newNode.data = data;
		if(pos == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node prev = head;
		for(int i = 0; i < pos-1; i++) {
			prev = prev.next;
		}
		newNode.next = prev.next;
		prev.next = newNode;
	}
	
	public void display(Node head) {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;	
		}
		System.out.println();
	}
	
	public void delete(Node head , int pos) {
		if(pos == 0) {
			head = head.next;
			return;
		}
		Node prev = head;
		for(int i = 0; i < pos -1; i++) {
			prev = prev.next;
		}
		prev.next = (prev.next).next;
	}
}
