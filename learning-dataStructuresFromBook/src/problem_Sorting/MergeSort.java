package problem_Sorting;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] A = {10,7,6,5,4};
		int[] mergeSort = mergeSort(A, 0, A.length-1);
		for(int i : mergeSort) {
			System.out.println(i);
		}
	}
		
	public static int[] mergeSort(int[] A , int start , int end) {
		if (end > start) {
			int mid = (end + start) / 2;
			mergeSort(A, start, mid);
			mergeSort(A, mid + 1, end);
			return merge(A, start, mid, end);
		}
		return null;
	}
	
	public static int[] merge(int[] A, int start, int mid , int end) {
		int l = mid - start + 1;
		int r = end - mid;
		int[] left_SubArray = new int[l];
		int[] right_SubArray = new int[r];
		
		for(int i=0;i<l;i++) {
			left_SubArray[i] = A[start+i];
		}
		for(int i=0; i<r;i++) {
			right_SubArray[i] = A[mid+1+i];
		}
		
		int i = 0,j = 0;
		int k = start;
		while(i < l && j < r) {
			if(left_SubArray[i] <= right_SubArray[j]) {
				A[k] = left_SubArray[i];
				i++;
			}else {
				A[k] = right_SubArray[j];
				j++;
			}
			k++;
		}
		while(i < l) {
			A[k] = left_SubArray[i];
			i++;
			k++;
		}
		while(j < r) {
			A[k] = right_SubArray[j];
			j++;
			k++;
		}
		return A;
	}

}
