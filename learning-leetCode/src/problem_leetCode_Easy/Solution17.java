package problem_leetCode_Easy;

public class Solution17 {
	
	public static void main(String[] args) {
		int[] num1 = {1,2,3,0,0,0};
		int[] num2 = {2,5,6};
		int[] mergeSortedArray = mergeSortedArray(num1, 3, num2, 3);
		for(int arr : mergeSortedArray) {
			System.out.println(arr);
		}
	}
	
	public static int[] mergeSortedArray(int[] num1 , int m, int[] num2 , int n) {
		if(m == 1 && n == 0) {
			return num1;
		}
		if(m == 0 && n == 1) {
			return num2;
		}
		
		int p1 = m-1;
		int p2 = n-1;
		int i = m+n-1;
		while(p2 >= 0) {
			if(p1 >= 0 && num1[p1] > num2[p2]) {
				num1[i] = num1[p1];
				i--;
				p1--;
			}else {
				num1[i] = num2[p2];
				i--;
				p2--;
			}
		}
		return num1;
	}

}
