package ds.singlelinkedlist;

public class App {
	
	public static void main(String[] args) {
		
		SingleLinkedList singleList = new SingleLinkedList();
		singleList.insertFirst(10);
		singleList.insertFirst(20);
		singleList.insertFirst(30);
		singleList.insertFirst(5);
		singleList.inserLast(111);
		
		singleList.display();
		System.out.println(singleList.deleteFirst());
		singleList.display();
	}

}
