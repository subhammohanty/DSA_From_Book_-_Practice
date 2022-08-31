package problem_leetCode_Easy;

public class Solution25 {
	public static void main(String[] args) {
		System.out.println(titleToNumber("BC"));
	}
	
	public static int titleToNumber(String columnTitle) {
		int sum  = 0;
		int j = 0;
		for(int i = columnTitle.length() - 1; i >= 0; i--) {
			sum += Math.pow(26, j) * (columnTitle.charAt(i) - 64);
			j++;
		}
		return sum;
	}

}
