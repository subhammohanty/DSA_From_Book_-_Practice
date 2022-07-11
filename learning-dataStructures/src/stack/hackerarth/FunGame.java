package stack.hackerarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class FunGame {
	
	public static void main(String[] args) {
		int[] arr = { 680, 569, 461, 858, 167, 223, 467, 457, 879, 584, 284, 794, 369, 197, 230, 135, 882, 801, 37, 235,
				279, 233, 900, 421, 6, 502, 867, 907, 448, 388, 318, 970, 550, 859, 277, 284 };
//		List<Integer> list = new ArrayList<Integer>(
//				Arrays.asList(680, 569, 461, 858, 167, 223, 467, 457, 879, 584, 284, 794, 369, 197, 230, 135, 882, 801,
//						37, 235, 279, 233, 900, 421, 6, 502, 867, 907, 448, 388, 318, 970, 550, 859, 277, 284));
//		List<Integer> list = new ArrayList<Integer>(Arrays.asList(8,7,11,6,18,2));
		
		
		int[] funGame = funGame(arr);
		for(int i =0; i<funGame.length; i++) {
			System.out.println(funGame[i]);
		}
		
	}
	
	public static int[] funGame(int[] arr){
		List<Integer> list = new ArrayList<Integer>();
		int[] res;
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> revStack = new Stack<Integer>();
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		for(int i = (arr.length-1); i >= 0; i--) {
			revStack.push(arr[i]);
		}
		
//		while(!stack.isEmpty() && !revStack.isEmpty()) {
//			System.out.println(stack.pop() + " - " + revStack.pop());
//		}
		
		while(!(stack.isEmpty()) && !(revStack.isEmpty())) {
			int B = stack.peek();
			int A = revStack.peek();
			if(A > B) {
				list.add(1);
				stack.pop();
			}else if(B > A) {
				list.add(2);
				revStack.pop();
			}else {
				list.add(0);
				stack.pop();
				revStack.pop();
			}
		}
		res = list.stream().mapToInt(Integer :: intValue).toArray();
		
		return res;	
	} 

}
