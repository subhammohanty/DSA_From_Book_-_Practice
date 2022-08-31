package problem_leetCode_Easy;

public class Solution21 {
	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		if(s == null) {
			return false;
		}
		StringBuilder sb = new StringBuilder();
		int i = 0;
		String s1 = s.toLowerCase();
		while(i<s1.length()) {
			if(Character.isAlphabetic(s1.charAt(i)) || Character.isDigit(s1.charAt(i))) {
				sb.append(s1.charAt(i));
			}
			i++;
		}
		String org = sb.toString();
		String rev = sb.reverse().toString();
		
		return org.equals(rev);
	}

}
