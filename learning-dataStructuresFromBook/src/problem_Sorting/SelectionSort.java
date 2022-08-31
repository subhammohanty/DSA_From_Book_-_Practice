package problem_Sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] A = {10,7,6,5,4};
		int[] selectionSort = selectionSort(A);
		for(int i : selectionSort) {
			System.out.println(i);
		}
		
	}
	
	public static int[] selectionSort(int[] A) {
		int loc;
		for(int i =0; i < A.length-1; i++) {
			loc = i;
			for(int k = i+1; k < A.length; k++) {
				if(A[k] < A[loc]) {
					loc = k;
				}
			}
			int temp = A[i];
			A[i] = A[loc];
			A[loc] = temp;
		}
		return A;
	}
	
	

}
