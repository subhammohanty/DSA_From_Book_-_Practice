package problem_leetCode_Easy;


public class ListNode {
	
	public ListNode head;
	
	int val;
	ListNode next;
	
	public ListNode() {}
	
	public ListNode(int val) {
		this.val = val;
	}
	public ListNode(int val ,ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public void insertFirst(int data) {
		ListNode newNode = new ListNode();
		newNode.val = data;
		if(head==null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	public ListNode  mergeTwoLists(ListNode h1, ListNode h2) {
		if(h1 == null && h2 == null) {return null;}
		if(h1 == null && h2 != null) {return h2;}
		if(h2 == null && h1 != null) {return h1;}
		ListNode resNode = new ListNode();
		if(h1.val < h2.val) {
			resNode.val = h1.val;
			h1 = h1.next;
		}else {
			resNode.val = h2.val;
			h2 = h2.next;
		}
		ListNode lastNode = resNode;
		while(h1 != null && h2!= null) {
			ListNode nowNode = new ListNode();
			if(h1.val <= h2.val) {
				nowNode.val = h1.val;
				h1 = h1.next;
			}else {
				nowNode.val = h2.val;
				h2 = h2.next;
			}
			lastNode.next = nowNode;
			lastNode = nowNode;
		}
		
		if(h1 != null) {
			lastNode.next = h1;
		}else if(h2 != null) {
			lastNode.next = h2.next;
		}
		return resNode;
	}
}
