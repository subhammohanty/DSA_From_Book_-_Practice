package problem_Seraching;

import java.util.Arrays;

public class CheckIfDuplicateExistsOrNot {
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6,7,7};
		System.out.println(isDuplicatePresent(A));
	}
	
	public static boolean isDuplicatePresent(int[] A) {
		if (A == null) {
			return false;
		}
		Arrays.sort(A);
		for (int i = 0; i < A.length-1; i++) {
			if (A[i] == A[i + 1]) {
				return true;
			}
		}
		return false;
	}

}
