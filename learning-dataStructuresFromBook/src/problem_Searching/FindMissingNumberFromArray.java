package problem_Searching;

import java.util.HashMap;
import java.util.Map;

public class FindMissingNumberFromArray {
	
	public static void main(String[] args) {
		int[] A = {5,6,7,9};
		System.out.println(findMissingNumber(A));
	}
	
	public static int findMissingNumber(int[] A) {
		if(A == null) {
			return 0;
		}
		Map<Integer , Integer> map = new HashMap<Integer, Integer>();
		int track = 0;
		int num = A[0];
		for(int i = 0; i<A.length; i++) {
			if(A[i] == num) {
				map.put(num, 1);
				track++;
			}else {
				map.put(num, 0);
			}
			 ++num;
		}
				
		return track > 0 ? map.entrySet().stream()
				.min((a1,a2) ->a1.getValue().compareTo(a2.getValue())).get().getKey() : 0;
	}

}
