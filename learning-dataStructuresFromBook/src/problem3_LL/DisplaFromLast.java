package problem3_LL;

public class DisplaFromLast {
	
	public Node head;
	
	public void displayFromLast(Node head) {
		if(head == null) {
			return ;
		}
		displayFromLast(head.next);
		System.out.println(head.data);
	}

}
