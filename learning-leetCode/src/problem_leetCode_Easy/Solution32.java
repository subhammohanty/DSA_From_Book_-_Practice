package problem_leetCode_Easy;

public class Solution32 {
	
	public static void main(String[] args) {
		Node l1 = new Node();
		l1.insertFirst(10);
		l1.insertFirst(20);
		l1.insertFirst(20);
		l1.insertFirst(10);
		l1.display();
		System.out.println();
		Node l2 = new Node();
		l2.insertFirst(10);
		l2.insertFirst(20);
		l2.insertFirst(20);
		l2.insertFirst(10);
		l2.display();
		System.out.println(isPalindrom(l1, l2));
	}
	
	public static boolean isPalindrom(Node head , Node reverse) {
		Node curr = head;
		Node reverseList = reverse;
		while(curr != null && reverseList != null) {
			System.out.println(curr.val);
			System.out.println(reverseList.val);
			if(curr.val != reverseList.val) {
				return false;
			}
			curr = curr.next;
			reverseList  = reverseList.next;
		}
		return true;
	}
	
//	public static ListNode reverse(ListNode head) {
//		if(head == null) {
//			return null;
//		}
//		ListNode curr = head;
//		ListNode prev = null;
//		while(curr != null) {
//			ListNode next = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = next;
//		}
//		return prev;
//	}

}
