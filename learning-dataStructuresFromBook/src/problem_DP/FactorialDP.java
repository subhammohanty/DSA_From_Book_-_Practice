package problem_DP;

public class FactorialDP {
	
	public static int num = 6;
	
	public static void main(String[] args) {
		System.out.println(factorial_Recurssion(num));
	}
	
	public static int factorial_Recurssion(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return (n * factorial_Recurssion(n - 1));
	}
	public static int[]fact = new int[num + 1];
	public static int factorialUisngDP(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		if(fact[n] != 0) {
			return fact[n];
		}else {
			return fact[n] = n * factorialUisngDP(n -1);
		}
	}

}
