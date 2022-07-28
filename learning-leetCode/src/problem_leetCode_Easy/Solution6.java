package problem_leetCode_Easy;

public class Solution6 {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		l1.insertFirst(4);
		l1.insertFirst(2);
		l1.insertFirst(1);
		l1.display();
		System.out.println();
		ListNode l2 = new ListNode();
		l2.insertFirst(4);
		l2.insertFirst(3);
		l2.insertFirst(1);
		l2.display();
		
		ListNode l3 = new ListNode();
		ListNode mergeTwoLists = l3.mergeTwoLists(l1, l2);
		
	}
	

}
