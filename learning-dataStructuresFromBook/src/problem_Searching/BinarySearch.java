package problem_Searching;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] A = {10,20,30,40,50};
		int binarySearch = binarySearchNonRecursive(A, 0, A.length-1, 50);
		if(binarySearch >= 0) {
			System.out.println("Item Found at " + binarySearch);
		}else {
			System.out.println("Item Not Found ");
		}
	}

	public static int binarySearch(int[] A , int start , int end , int item) {
		int mid = start + (end-start) / 2;
		if(start > end) {
			return -1;
		}
		if(A[mid] == item) {
			return mid;
		}else if(A[mid] < item) {
//			start = mid+1;
			return binarySearch(A, mid+1, end, item);
		}else {
//			end = mid - 1;
			return binarySearch(A, start, mid-1, item);
		}
	}
	public static int binarySearchNonRecursive(int[] A , int start , int end , int item) {
		int mid = 0;
		while(start <= end) {
			mid =  start + (end - start) / 2;
			if(A[mid] == item) {
				return mid;
			}else if(A[mid] < item) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
		
	}
}
