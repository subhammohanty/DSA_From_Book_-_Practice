package problem3_LL;

public class FlyodsAlgo {
	
	public Node head;
	
	//To check if loopExists or not
	
	public boolean findFyodsSolution() {
		Node fastPtr = head;
		Node slowPtr = head;
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
	
	//If Loop Exists then find the start node
	
	public Node findStart() {
		Node fastPtr = head;
		Node slowPtr = head;
		boolean loopExists = false;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr) {
				loopExists = true;
				break;
			}
		}
		if (loopExists) {
			slowPtr = head;
			while (slowPtr != fastPtr) {
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next;
			}
			return fastPtr;
		} else {
			return null;
		}

	}
	
	//Find Length of the loop
	
	public int lengthLoop() {
		Node fastPtr = head;
		Node slowPtr = head;
		boolean loopExists = false;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr) {
				loopExists = true;
				break;
			}
		}
		int length = 0;
		if (loopExists) {
			do {
				slowPtr = slowPtr.next;
				length++;
			} while (slowPtr != fastPtr);
		}
		return length;

	}
	
}
