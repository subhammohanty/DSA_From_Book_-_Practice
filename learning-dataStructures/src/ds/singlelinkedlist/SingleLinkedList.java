package ds.singlelinkedlist;

public class SingleLinkedList {
	
	private Node first;
	
	public SingleLinkedList() {}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(first);
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node tempNode = first;
		first = first.getNext();
		return tempNode;
	}
		
	public void display() {
		System.out.println("List (first ---> last)");
		Node currentNode = first;
		while(currentNode != null) {
			currentNode.display();
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
	
	public void inserLast(int data) {
		Node currentNode = first;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}
	

}
