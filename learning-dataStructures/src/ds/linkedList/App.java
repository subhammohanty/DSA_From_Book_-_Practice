package ds.linkedList;

public class App {
	
	public static void main(String[] args) {
		
		Node nodeA = new Node();
		nodeA.data = 3;
		
		Node nodeB = new Node();
		nodeB.data = 4;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = null;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeC));
		System.out.println(listLength(nodeD));
		
	}
	
	public static int listLength(Node aNode) {
		int length = 0;
		Node tempNode = aNode;
		while(tempNode != null) {
			length++;
			tempNode = tempNode.next;
		}
		return length;
		
	}

}
