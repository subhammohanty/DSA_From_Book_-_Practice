package problem_Searching;

public class PivotElement {
	
	public static void main(String[] args) {
		int[] A = {1,8,4,7,6,7};
		System.out.println(pivotElement(A));
	}
	
	public static int pivotElement(int[] A) {
		int sum = 0;
		for(int i : A) {
			sum += i;
		}
		for(int i=0; i<A.length; ++i) {
			sum -= A[i];
			if(sum == 0) {
				return i;
			}
			sum -= A[i];
		}
		return -1;
	} 

}
