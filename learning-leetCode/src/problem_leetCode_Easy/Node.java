package problem_leetCode_Easy;

public class Node {

public Node head;
	
	int val;
	Node next;
	
	public Node() {}
	
	public Node(int val) {
		this.val = val;
	}
	public Node(int val ,Node next) {
		this.val = val;
		this.next = next;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.val = data;
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
			System.out.println(current.val);
			current = current.next;
		}
	}
	public  Node reverse(Node head) {
		if(head == null) {
			return null;
		}
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
