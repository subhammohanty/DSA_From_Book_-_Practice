package problem_leetCode_Easy;

public class Solution15 {
	
	public static void main(String[] args) {
		System.out.println(climbStairs(8));
	}
	
	public static int climbStairs(int n) {
		if(n == 0) {
			return 0;
		}
		if(n >= 2) {
			int res = fibonacci(n-1);
			int res2 = fibonacci(n-2);
//			return fibonacci(n - 1) + fibonacci(n - 2);
			System.out.println(res + res2);
		}
		return 0;
	}
	public static int fibonacci(int number) {
		int n1 =0;
		int n2 = 1;
		int n3 = 0;
		int result = 0;
		while(number > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			result = n3;
			number--;
		}
		return result;
	}

}
