package problem_Searching;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] A = {40,20,10,30,50};
		int linearSearch = linearSearch(A, 30);
		if(linearSearch >= 0) {
			System.out.println("Item Found at " + linearSearch);
		}
	}
	
	public static int linearSearch(int[] A , int item) {
		if(A == null) {
			return -1;
		}
		for(int i=0; i<A.length; i++) {
			if(A[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
