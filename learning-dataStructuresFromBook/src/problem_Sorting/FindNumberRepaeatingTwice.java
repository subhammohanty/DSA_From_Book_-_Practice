package problem_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumberRepaeatingTwice {
	
	public static void main(String[] args) {
		int[] A = {4,2,4,5,2,3,1};
		System.out.println(findTwice(A));
	}
	
	
	public static List<Integer> findTwice(int[] A){
		if(A == null) {
			return null;
		}
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(A);
		for(int i =0; i<A.length-1; i++) {
			if(A[i] == A[i+1]) {
				list.add(A[i]);
			}
		}
		return list;
	}
}
