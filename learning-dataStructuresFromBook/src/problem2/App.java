package problem2;

public class App {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirst(10);
		linkedList.insertFirst(20);
		linkedList.insertFirst(30);
		linkedList.insertFirst(40);
		
		linkedList.display();
		
		System.out.println("========================");
		System.out.println("Data from nth Position : ");
		Node returnNthPositionFromLast = linkedList.returnNthPositionFromLast(2);
		System.out.println(returnNthPositionFromLast.data);
	}
	


}
