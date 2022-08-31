package problem_Sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] A = {10,7,6,5,4};
		int[] bubbleSort = bubbleSort(A);
		for(int i : bubbleSort) {
			System.out.println(i);
		}
	}
	
	public static int[] bubbleSort(int[] A) {
		int temp;
		for(int i =0; i<A.length-1; i++) {
			for(int k=0; k < A.length-i-1; k++) {
				if(A[k] > A[k+1]) {
					temp = A[k];
					A[k] = A[k+1];
					A[k+1] = temp;
				}
			}
		}
		return A;
	}

}
