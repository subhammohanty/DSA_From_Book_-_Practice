package problem3;

public class MiddleOfList {
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
	
	//Middle Of A List
	public Node findMiddle() {
		Node ptr1 ,ptr2;
		ptr1 = ptr2 = head;
		int i = 0;
		while(ptr1.next != null) {
			if(i == 0) {
				ptr1 = ptr1.next;
				i = 1;
			}else if(i == 1) {
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
				i = 0;
			}
		}
		return ptr2;
	}

}
