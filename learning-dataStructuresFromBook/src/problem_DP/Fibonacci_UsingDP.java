package problem_DP;

public class Fibonacci_UsingDP {
	public static int num = 7;
	public static void main(String[] args) {
		int temp = num;
		while(temp > 0) {
			System.out.println(obtimise(temp));
			temp--;
		}
		
	}
	
	public static int fibonacci_Recurssion(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return fibonacci_Recurssion(n - 1) + fibonacci_Recurssion(n - 2);
	}
	
	public static int[] fib = new int[num + 1];
	public static int fibonnacci_MemorizationDP(int n) {
		if(n == 0|| n == 1) {
			return n;
		}
		if(fib[n] != 0) {
			return fib[n];
		}
		return fib[n] = fibonnacci_MemorizationDP(n - 1) + fibonacci_Recurssion(n - 2);
	}
	
	public static int fibonnacci_TablulationDP(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 2; i < n; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[n-1];
	}
	
	public static int obtimise(int n) {
		int a = 0, b= 1 , sum=0 ,i;
		for(i = 2; i < n; i++) {
			sum = a+b;
			a = b;
			b = sum;
			sum = a;
		}
		return sum;
	}

}
