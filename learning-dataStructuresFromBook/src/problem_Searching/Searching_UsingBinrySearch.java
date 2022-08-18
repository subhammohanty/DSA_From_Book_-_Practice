package problem_Searching;

public class Searching_UsingBinrySearch {
	
	public static void main(String[] args) {
		int[] A = {2,3,4,5,7,9,10};
		System.out.println(binarySearch(A, 7));
	}
	
	public static int binarySearch(int[] A , int data) {
		int low =0;int heigh = A.length-1;
		int mid;
		while(low <= heigh) {
			mid = low + (heigh - low) / 2;
			if(A[mid] == data) {
				return mid;
			}else if(A[mid] < data) {
				low = mid + 1;
			}else {
				heigh = mid - 1;
			}
		}
		return -1;
	}

}
