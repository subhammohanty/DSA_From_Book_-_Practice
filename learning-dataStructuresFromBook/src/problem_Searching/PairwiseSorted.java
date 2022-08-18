package problem_Searching;

public class PairwiseSorted {
	
	public static void main(String[] args) {
		int[] A = {1,3,15,9,11};
		System.out.println(isPairWiseSorted(A));
	}
	
	public static boolean isPairWiseSorted(int[] A) {
		if(A.length == 0 || A.length == 1){
			return true;
		}
		for(int i =0; i<A.length-1; i+=2) {
			if(A[i] > A[i+1]) {
				return false;
			}
		}
		return true;
	}

}
