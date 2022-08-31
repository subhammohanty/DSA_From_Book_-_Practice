package problem_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class SameSetOrNot {
	
	public static void main(String[] args) {
		int[] A = {2,5,6,8,10,2,2};
		int[] B = {2,5,2,8,10,6,2};
		System.out.println(isSameOrNot(A, B));
	}
	
	public static boolean isSameOrNot(int[] A , int[] B) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < A.length; i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			}else {
				map.put(A[i], 1);
			}
		}
		for(int i = 0; i < B.length; i++) {
			if(!map.containsKey(B[i])) {
				return false;
			}else {
				map.put(B[i], map.get(B[i]) - 1);	
			}
		}
		
		 Optional<Entry<Integer,Integer>> findAny = map.entrySet().stream()
		.filter(m1 -> m1.getValue() > 0).findAny();
		 
		 if(findAny.isEmpty()) {
			 return true;
		 }else {
			 return false;
		 }
		
	}

}
