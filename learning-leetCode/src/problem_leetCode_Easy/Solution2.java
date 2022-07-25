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
	
	public static boolean isPalindromOpimise(int x) {
		if(x < 0 || (x != 0 && x%10 == 0)) {return false;}
		int res = 0;
		while(x > res) {
			res = res * 10 + x %10;
			x = x / 10;
		}
		return (x == res || x == res/10);
	}
}
