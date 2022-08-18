package problem_Seraching;

import java.util.HashMap;
import java.util.Map;

public class MaximumRepetedElement {
	
	public static void main(String[] args) {
		int[] A = {1,2,2,4,4,4,7,7,8,8,8,8};
		System.out.println(maximumRepeate(A));
	}

	public static int maximumRepeate(int[] A) {
		if (A == null) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		return map.entrySet().stream()
				.max((a1, a2) -> a1.getValue().compareTo(a2.getValue())).get().getKey();
	}
}
