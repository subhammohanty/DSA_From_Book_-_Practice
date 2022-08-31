package problem_leetCode_Easy;

public class Solution27 {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		l1.insertFirst(6);
		l1.insertFirst(5);
		l1.insertFirst(4);
		l1.insertFirst(3);
		l1.insertFirst(6);
		l1.insertFirst(2);
		l1.insertFirst(1);
//		l1.display();
		l1.removeElements(l1, 30);
		l1.display();
	}
	
//	public static ListNode removeElements(ListNode head, int val) {
//		if(head == null){
//            return null;
//        }
//        if(head.val == val){
//            head = head.next;
//        }
//        
//        ListNode current = head;
//        ListNode prev = current;
//        while(current != null){
//            if(current.val == val && prev != current){
//                prev.next = current.next;
//                current = current.next;
//            }else if(current.val == val && prev == current){
//                prev.next = current.next;
//                current = current.next;
//            }
//            else{
//                prev = current;
//                current = current.next;
//            }
//            
//        }
//        return head;
//	}

}
