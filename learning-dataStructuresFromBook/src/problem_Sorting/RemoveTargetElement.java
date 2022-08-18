package problem_Sorting;

public class RemoveTargetElement {
	
	public static void main(String[] args) {
		int[] A = {0,1,2,2,3,0,4,2};
		System.out.println(remoeTargetElement(A, 2));
	}
	
	public static int remoeTargetElement(int[] A , int target) {
		if(A==null) {
			return 0;
		}
		int j =0;
		for(int i=0;i<A.length; i++) {
			if(A[i] != target) {
				A[j] = A[i];
				j++;
			}
		}
		return j;
	}

}
