package problem3;

public class CheckEvenOrOdd {
	
	public Node head;
	
	
	public boolean checkEvenOdd() {
		Node cuNode = head;
		
		while(cuNode != null && cuNode.next != null) {
			cuNode = cuNode.next.next;
		}
		if(cuNode == null) {
			return true;
		}else {
			return false;
		}
	}

}
