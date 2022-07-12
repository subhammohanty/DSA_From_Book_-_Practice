package problem3_LL;

public class App {
	
	public static void main(String[] args) {
		InsertInASortedList sortedLL = new InsertInASortedList();
		sortedLL.insertFirst(60);
		sortedLL.insertFirst(50);
		sortedLL.insertFirst(30);
		sortedLL.insertFirst(20);
		sortedLL.insertFirst(10);
		
		sortedLL.display();
		System.out.println("After insertion");
		sortedLL.isertInASorted(40);
		sortedLL.display();
		
		
//		========================================
		System.out.println("Reverse A Linked List");
		ReverseASingleLinkedList reverse = new ReverseASingleLinkedList();
		reverse.insertFirst(10);
		reverse.insertFirst(20);
		reverse.insertFirst(30);
		reverse.insertFirst(40);
		reverse.display();
		System.out.println("After Reverse : ");
		reverse.reverseALinkedList();
		reverse.display();
		
		System.out.println("Middle Of A Linked List");
		MiddleOfList middle = new MiddleOfList();
		middle.insertFirst(10);
		middle.insertFirst(20);
		middle.insertFirst(30);
		middle.insertFirst(40);
		middle.insertFirst(50);
		System.out.println("Middle : ");
		Node findMiddle = middle.findMiddle();
		System.out.println(findMiddle.data);
	}

}
