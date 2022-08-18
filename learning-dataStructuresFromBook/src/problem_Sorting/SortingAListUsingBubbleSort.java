package problem_Sorting;

public class SortingAListUsingBubbleSort {
	
	public static void main(String[] args) {
		
	}
	
	public static ListNode sort(ListNode head) {
		//First find size;
		if(head == null) {
			return null;
		}
		int counter = 0;
		ListNode currentode = head;
		while(currentode != null) {
			counter++;
			currentode = currentode.next;
		}
		
		for(int i=0; i<counter; i++) {
			for(int j =0; j < counter-i-1; j++) {
				ListNode temp = head;
				ListNode temp1 = temp.next;
				int d;
				if(temp.val > temp1.val) {
					d= temp.val;
					temp.val = temp1.val;
					temp1.val = d;
				}
				temp = temp1;
				temp1 = temp1.next;
			}
		}
		return head;
	}

}
