package problem_leetCode_Easy;

public class Solution16 {
	
	public static void main(String[] args) {
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null) {return null;}
		ListNode currentNode = head;
		
		while(currentNode != null && currentNode.next != null) {
			if(currentNode.val == currentNode.next.val) {
				currentNode.next = currentNode.next.next;
			}else {
				currentNode = currentNode.next;
			}
		}
		return head;
	}

}
