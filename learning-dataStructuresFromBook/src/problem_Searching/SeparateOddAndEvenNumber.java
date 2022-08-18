package problem_Searching;

public class SeparateOddAndEvenNumber {
	
	public static void main(String[] args) {
		int[] A = {0,2,0,2,0,2,0,2};
		int[] separateOddAndEven = separateOddAndEven(A);
		for(int i : separateOddAndEven) {
			System.out.println(i);
		}
	}
	
	public static int[] separateOddAndEven(int[] A) {
		int mid = -1;
		int left = 0;
		int right = A.length;
		while(left < right) {
			if(A[left] == 0) {
				mid++;
				int temp = A[left];
				A[left] = A[mid];
				A[mid] = temp;
				left++;
			}else if(A[left] == 2) {
				right--;
				int temp = A[left];
				A[left] = A[right];
				A[right] = temp;
			}else {
				left++;
			}
		}
		return A;
	}

}
