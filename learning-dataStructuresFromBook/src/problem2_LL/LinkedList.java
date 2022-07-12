package problem2_LL;

public class LinkedList {
	
	public Node head;
	
	public LinkedList() {
	}
	
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

	//Find nth Node from end of LL
	
	public Node returnNthPositionFromLast(int n) {
		Node mainPtr = head;
		Node refPtr = head;
		
		int count = 0;
		while(count < n) {
			refPtr = refPtr.next;
			count++;
		}
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	} 
}
