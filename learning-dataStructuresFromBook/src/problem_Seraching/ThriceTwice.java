package problem_Seraching;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThriceTwice {
	
	public static void main(String[] args) {
		int[] A = {1,1,1,2,2,2,3,3,4,4,4,6,6};
		System.out.println(findThriceTwice(A));
	}
	
	public static List<Integer> findThriceTwice(int[] A){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		return map.entrySet().stream().filter(a -> a.getValue() % 2 == 0).map(a -> a.getKey())
				.collect(Collectors.toList());
	}
	

}
