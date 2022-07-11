package ds.doublylinkedlist;

public class App {
	
	public static void main(String[] args) {
		
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertFirst(30);
		dl.insertFirst(20);
		dl.insertFirst(10);	
		dl.display();
		System.out.println();
		
		dl.insertLast(40);
		dl.insertLast(50);
		dl.display();
		System.out.println();
		
		dl.insertInPos(80, 2);		
		dl.display();
		System.out.println();
		
		dl.deleteFirst();
		dl.display();
		System.out.println();
		
		dl.deleteLast();
		dl.display();
		System.out.println();
		
		dl.deleteInPos(2);
		dl.display();
		System.out.println();
	}
	
	

}
