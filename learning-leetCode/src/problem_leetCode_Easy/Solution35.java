package problem_leetCode_Easy;

public class Solution35 {
	
	public static void main(String[] args) {
		System.out.println(isUgly(14));
	}
	
	public static boolean isUgly(int n) {
		if (n == 1) {
			return true;
		}
		int temp = n;
		while (temp > 1) {
			if (temp % 2 == 0) {
				temp = temp / 2;
			} else if (temp % 3 == 0) {
				temp = temp / 3;
			} else if (temp % 5 == 0) {
				temp = temp / 5;
			} else {
				return false;
			}
		}
		return true;
	}

}
