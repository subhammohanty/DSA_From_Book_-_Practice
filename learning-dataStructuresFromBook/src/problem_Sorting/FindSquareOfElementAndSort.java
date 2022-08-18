package problem_Sorting;

import java.util.Arrays;

public class FindSquareOfElementAndSort {
	
	public static void main(String[] args) {
		int[] A = {8,3,4,9,2};
		System.out.println(squareAndSort(A));
		int[] squareAndSort = squareAndSort(A);
		for(int i : squareAndSort) {
			System.out.println(i);
		}
	}
	
	public static int[] squareAndSort(int[] A) {
		if(A==null) {
			return null;
		}
		int[] res = new int[A.length];
		for(int i=0;i<A.length;i++) {
			res[i] = A[i]*A[i];
		}
		Arrays.sort(res);
		return res;
	}

}
