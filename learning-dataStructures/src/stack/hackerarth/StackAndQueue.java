package stack.hackerarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackAndQueue {
	
	public static void main(String[] args) {
		long[] arr = {10,9,1,2,3,4,5,6,7,8};
		System.out.println(queue(arr, 10,5));
	}
	
	// arr[] = {10 9 1 2 3 4 5 6 7 8}
	public static long queue(long[] arr, int n , int k) {
		long sum = 0;
		long sumk = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(i >= n-k) {
//				sumk += arr[i];
//			}
//		}
		
		for(int i = k; i < arr.length; i++) {
			sumk += arr[i];
		}
		
		long max = Integer.MIN_VALUE;
		for(int i = 0; i < k; i++) {
			sum += arr[i];
			sumk -= arr[n-k+i];
			max = Math.max(max, sum + sumk);
		}
		return max;
		
//		Stack<Integer> stack = new Stack<Integer>();
//		int index = Arrays.binarySearch(arr, k);
//		List<Long> subList = new ArrayList<Long>();
//		List<Long> list = new ArrayList<Long>();	
//		for(int i = (n-k)+1; i < arr.length; i++) {
//			subList.add(arr[i]);
//		}	
//		long sumArr = 0;	
//		long subListSum = 0;
//		subList.add(0L);
////		System.out.println("List Removal : " + subList);
//		for(int i = 0; i < arr.length && subList.size() > 0; i++) {
//			sumArr += arr[i];
////			System.out.println("Sum Array : " + sumArr);
//			subListSum = subList.stream().mapToInt(Long::intValue).reduce(0, (a, b) -> a + b);
////			System.out.println("Sum List :" + subListSum);
//			subList.remove(0);
//			list.add(sumArr + subListSum);
//		}
////		System.out.println(list);
//		  long maxVaue = list.stream()
//		  .max((i1 , i2) -> (i1.compareTo(i2))).get().longValue();
//		  System.out.println(maxVaue);	
//		return maxVaue;
		
}
}