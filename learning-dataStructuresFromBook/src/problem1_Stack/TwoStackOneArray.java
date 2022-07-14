package problem1_Stack;

public class TwoStackOneArray {
	
	int[] data;
	int tos1;
	int tos2;
	
	public TwoStackOneArray(int capacity) {
		this.data = new int[capacity];
		this.tos1 = -1;
		this.tos2 = capacity;
	}

	public int size1() {
		return tos1 + 1;
	}
	
	public int size2() {
		return data.length - tos2;
	}
	
	public void push1(int val) {
		if(tos2 == tos1 + 1) {
			System.out.println("Stack is Full");
		}else {
			tos1++;
			data[tos1] = val;
		}
	}
	
	public void push2(int val) {
		if(tos2 == tos1 + 1) {
			
		}else {
			tos2--;
			data[tos2] = val;
		}
	}
	
	public int pop1() {
		if(size1() == 0) {
			System.out.println("Stack Empty");
		}
		int val = data[tos1];
		tos1--;
		return val;
	}
	public int pop2() {
		if(size2() == 0) {
			System.out.println("Stack Empty");
		}
		int val = data[tos2];
		tos2++;
		return val;
	}
	
	public int top1() {
		if(size1() == 0) {
			System.out.println("Stack Empty");
			return -1;
		}
		int val = data[tos1];
		return val;
		
	}
	public int top2() {
		if(size2() == 0) {
			System.out.println("Stack Empty");
			return -1;
		}
		int val = data[tos2];
		return val;
		
	}
}
