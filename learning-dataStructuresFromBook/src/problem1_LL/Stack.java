package problem1_LL;

import java.util.EmptyStackException;

public class Stack {

	private Node top;
	private int size;

	private class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}


	public void display() {
		Node current = top;
		while(current != null) {
			System.out.println("Data : " + current.data);
			current = current.next;
		}
	}

}
