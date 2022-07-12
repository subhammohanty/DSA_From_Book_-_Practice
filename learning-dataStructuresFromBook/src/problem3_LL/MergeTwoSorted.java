package problem3_LL;

public class MergeTwoSorted {
	
//	public Node head;
	
	public Node merge(Node h1 , Node h2) {
		Node head = new Node();
		Node cuNode = head;
		while(h1 != null && h2 != null) {
			if(h1.data <= h2.data) {
				cuNode.next = h1;
				h1 = h1.next;
			}else {
				cuNode.next = h2;
				h2 = h2.next;
			}
		}
		if(h1 != null) {
			cuNode.next = h1;
		}else if (h2 != null){
			cuNode =  h2;
		}
		return head.next;
	}

}
