package problem_Searching;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepetingElement {
	
	public static void main(String[] args) {
		int[] A = {3,2,1,2,3};
		System.out.println(firstRepeatingElement(A));
	}
	
	public static int firstRepeatingElement(int[] A) {
		if(A == null) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < A.length; i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) * - 1);
			}else {
				map.put(A[i], i+1);
			}
		}
		return map.entrySet().stream()
				.filter(a1 -> a1.getValue() < 0)
				.max((a1,a2) -> a1.getValue().compareTo(a2.getValue())).get().getKey();
	}

}
