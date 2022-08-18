package problem_Sorting;

public class RemoveDuplicatesFromSameArray {
	
	public static void main(String[] args) {
		int[] A = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicate(A));
	}
	
	public static int removeDuplicate(int[] A) {
		if (A == null) {
			return 0;
		}
		if (A.length == 1) {
			return A[0];
		}
		int j = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] != A[i + 1]) {
				A[j] = A[i];
				j++;
			}
		}
		A[j++] = A[A.length - 1];
		return j;
	}

}
