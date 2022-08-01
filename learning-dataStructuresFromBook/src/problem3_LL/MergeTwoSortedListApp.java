package problem3_LL;

public class MergeTwoSortedListApp {
	
	public static void main(String[] args) {
	
		MergeTwoSorted l1 = new MergeTwoSorted();
		l1.insertFirst(4);
		l1.insertFirst(2);
		l1.insertFirst(1);
		l1.display();
		System.out.println();
		MergeTwoSorted l2 = new MergeTwoSorted();
		l2.insertFirst(4);
		l2.insertFirst(3);
		l2.insertFirst(1);
		l2.display();
		System.out.println();
		
		MergeTwoSorted l3 = new MergeTwoSorted();
		Node merge = l3.merge(l1, l2);
		display(merge);
		
	}
	
	public static void display(Node head) {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
