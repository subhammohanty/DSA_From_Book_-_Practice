package problem_leetCode_Easy;

public class Solution34 {
	
	public static void main(String[] args) {
		System.out.println(divide(38));
	}
	
	public static int divide(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num = num/10;
		}
		if(sum > 10) {
			return divide(sum);
		}
		return sum;

	}

}
