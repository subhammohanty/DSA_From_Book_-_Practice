package problem_Sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] A = {10,7,6,5,4};
		int[] quickSort = quickSort(A, 0, A.length-1);
		for(int i : quickSort) {
			System.out.println(i);
		}
		
	}
	
	public static int[] quickSort(int[] A, int low, int heigh) {
		int pivot;
		if (heigh > low) {
			pivot = Partition(A, low, heigh);
			quickSort(A, low, pivot - 1);
			quickSort(A, pivot + 1, heigh);
		}
		return A;
	}
	
	public static int Partition(int[] A , int low , int heigh) {
//		int left,right,pivot_Item = A[low];
//		left = low;
//		right = heigh;
//		
//		while(left < right) {
//			while(A[left] <= pivot_Item) {
//				left++;
//			}
//			while(A[right] > pivot_Item) {
//				right--;
//			}
//			if(left < right) {
//				swap(A , low , heigh);
//			}
//		}
//		A[low] = A[right];
//		A[right] = pivot_Item;
//		return right;
		
		int pivot = A[heigh];
		int pIndex = low;
		
		for(int i=low; i < heigh; i++) {
			if(A[i] <= pivot) {
				int t = A[pIndex];
				A[pIndex] = A[i];
				A[i] = t;
				pIndex++;
			}
		}
		int t = A[pIndex];
		A[pIndex] = A[heigh];
		A[heigh] = t;
		return pIndex;
	}

	private static void swap(int[] A, int left, int right) {
		int temp =0;
		temp = A[left];
		A[left] = A[right];
		A[right] = temp;
	}
	

}
