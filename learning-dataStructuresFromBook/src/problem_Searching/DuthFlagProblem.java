package problem_Searching;

public class DuthFlagProblem {
	
	public static void main(String[] args) {
		int[] A = {0,1,1,2,0,2,0,2};
		int[] dutchFlag = dutchFlag(A);
//		for(int i : dutchFlag) {
//			System.out.println(i);
	}
//	}
	
	public static int[] dutchFlag(int[]A) {
		int low = 0;
		int mid = 0;
		int heigh = A.length -1;
		while(mid <= heigh) {
			switch (A[mid]) {
			
				case 0: 
					swap(A[low] , A[mid]);
					low++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					swap(A[mid] , A[heigh]);
					heigh--;
					break;
			}
		}
		return A;
	}
	
	public static void swap(int a , int b) {
		int temp = a;
		a= b;
		b = temp;
		System.out.println(a );
		System.out.println(b);
	}

}
