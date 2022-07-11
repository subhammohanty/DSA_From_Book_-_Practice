package ds.stack;

public class App {
	
	public static void main(String[] args) {
		Stack stack = new Stack(3);
//			stack.push(2);
//			stack.push(4);
//			stack.push(6);
//			stack.push(8);
//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		System.out.println(reverse("Hello"));
	}
	
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		int length = str.length();
		Stack stack = new Stack(length);
		char[] charArray = str.toCharArray();
		int counter = 0;
		while (counter < length) {
			stack.push(charArray[counter]);
			counter++;
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

}
