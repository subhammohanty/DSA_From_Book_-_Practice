package problem_leetCode_Easy;

public class Solution30 {
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(32));
	}
	
	public static boolean isPowerOfTwo(int n) {
		if(n == 0) {
			return false;
		}
		int res = 1;
		int temp = n;
		if(temp % 2 != 0) {
			return false;
		}else {
			while(temp != 1) {
				temp = temp / 2;
				res = res*2;
			}
		}
		return res == n;
	}

}
