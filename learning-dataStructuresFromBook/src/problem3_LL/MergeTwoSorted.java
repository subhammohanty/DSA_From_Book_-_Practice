package problem3_LL;

public class MergeTwoSorted {
	
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
	
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	
	public Node merge(MergeTwoSorted m1 , MergeTwoSorted m2) {

		Node h1 = m1.head;
		Node h2 = m2.head;
		
		Node resNode = new Node();
		
		if(h1.data < h2.data) {
			resNode.data = h1.data;
			h1 = h1.next;
		}else {
			resNode.data = h2.data;
			h2 = h2.next;
		}
		
		Node lastNode = resNode;
		
		while(h1 != null && h2 != null) {
			 Node nowNode = new Node();
			if(h1.data <= h2.data) {
				nowNode.data = h1.data;
				h1 = h1.next;
//				System.out.println("Inserting from h1 : " + cuNode.data);
			}else {
				nowNode.data = h2.data;
				h2 = h2.next;
//				System.out.println("Inserting from h2 : " + cuNode.data);
			}
			lastNode.next = nowNode;
			lastNode = nowNode;
		}
		
		if(h1 != null) {
			lastNode.next = h1;
//			System.out.println("Inserting from h1 : " + cuNode.data);
		}else if (h2 != null){
			lastNode.next =  h2;
//			System.out.println("Inserting from h2 : " + cuNode.data);
		}
		return resNode;
	}
	
}
