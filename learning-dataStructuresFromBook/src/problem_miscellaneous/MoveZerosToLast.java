package problem_miscellaneous;

public class MoveZerosToLast {
	
	public static void main(String[] args) {
		int[] A = {2,0,4,5,7,0,1,0};
		moveZerosToEnd(A);
	}
	
	public static void moveZerosToEnd(int[] A) {
		int i ,j;
		for(i = 0, j = 0; i < A.length; i++) {
			if(A[i] != 0) {
				mySwap(A, j++, i);
			}
		}
		printArray(A);
	}
	
	public static void mySwap(int[] A , int i , int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	public static void printArray(int[] A) {
		for(int a : A) {
			System.out.println(a);
		}
	}

}
