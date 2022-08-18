package problem_Searching;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] A = {2,3,4,5,6};
		int[] twoSum = twoSum(A, 9);
		System.out.println(A[twoSum[0]]  + " " + A[twoSum[1]]);
	}
	
	public static int[] twoSum(int[] A , int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<A.length; i++) {
			int rem = target - A[i];
			if(map.containsKey(rem)) {
				int[] result = {map.get(rem) , i};
				return result;
			}else {
				map.put(A[i], i);
			}
		}
		return null;
	}

}
