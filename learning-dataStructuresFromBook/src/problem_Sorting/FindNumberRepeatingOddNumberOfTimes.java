package problem_Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNumberRepeatingOddNumberOfTimes {
	
	public static void main(String[] args) {
		int[] A = {1,2,3,2,3,1,4,4,4};
		System.out.println(findOdd(A));
	}
	
	public static int findOdd(int[] A) {
		if(A == null) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<A.length; i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			}else {
				map.put(A[i], 1);
			}
		}
		return map.entrySet().stream()
				.filter(a -> a.getValue() % 2 != 0)
				.collect(Collectors.toList()).get(0).getKey();
	}

}
