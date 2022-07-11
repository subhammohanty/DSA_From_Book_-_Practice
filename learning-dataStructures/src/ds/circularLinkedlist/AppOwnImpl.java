package ds.circularLinkedlist;

public class AppOwnImpl {
	
	public static void main(String[] args) {
		
		CircularLinkedListOwnImpl circularLL = new CircularLinkedListOwnImpl();
		
		circularLL.insertFirst(10);
		circularLL.insertFirst(30);
		circularLL.insertFirst(40);
		circularLL.insertLast(60);
		circularLL.insertLast(80);
		circularLL.insertinPos(20, 2);
		circularLL.insertinPos(4, 0);
		
		circularLL.display();
		System.out.println();
		
//		circularLL.deleteFirst();
//		circularLL.display();
//		System.out.println();
//		
//		circularLL.deleteLast();
//		circularLL.display();
		
		circularLL.deleteInPos(0);
		circularLL.display();

		
	}

}
