//Implement Stack Using Linked List.
package problem1;

public class StackUsingLinkedList {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		System.out.println("Before Inserting : " + stack.size());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("After Inserting : " + stack.size());
		stack.display();
	}

}
