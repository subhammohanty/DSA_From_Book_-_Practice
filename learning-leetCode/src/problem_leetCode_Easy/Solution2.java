package problem_leetCode_Easy;

public class Solution2 {
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrom(10));
	}

	
	public static boolean isPalindrom(int x) {

		String string = Integer.toString(x);
		StringBuilder sb = new StringBuilder(string);
		boolean result = sb.reverse().toString().equals(string) ? true : false;
		return result;

	}
}
