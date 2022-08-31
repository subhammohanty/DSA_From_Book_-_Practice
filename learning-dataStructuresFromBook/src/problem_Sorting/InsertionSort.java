package problem_Sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] A = {10,7,6,5,4};
		int[] insertionSort = insertionSort(A);
		for(int i : insertionSort) {
			System.out.println(i);
		}
	}
	
	public static int[] insertionSort(int[] A) {
		for(int i=1; i<A.length; i++) {
			int temp = A[i];
			int j = i-1;
			while(j >= 0 && temp < A[j]) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = temp;
		}
		return A;
	}

}
