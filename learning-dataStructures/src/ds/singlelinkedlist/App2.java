package ds.singlelinkedlist;

public class App2 {
	
	public static void main(String[] args) {
		
		Node n1 = new Node();
		n1.data = 5;
		
		Node n2 = new Node();
//		n2.data = 10;
		
		Node n3 = new Node();
//		n3.data = 16;
		
		Node n4 = new Node();
//		n4.data = 4;
		
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = null;
		
		SingleLinkedList2 sl = new SingleLinkedList2();
		sl.insert(n1, 5, 0);
		sl.insert(n1, 10, 1);
		sl.insert(n1, 16, 2);
		sl.insert(n1, 4, 3);
		sl.insert(n1, 19, 2);
		sl.delete(n1, 2);
		sl.display(n1);
	}

}
