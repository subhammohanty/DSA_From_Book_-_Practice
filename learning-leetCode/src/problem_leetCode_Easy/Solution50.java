package problem_leetCode_Easy;

public class Solution50 {
	
	public static void main(String[] args) {
		String s = "aaaaaa";
		String t = "bbaaaa";
		System.out.println(isSubsequence(s, t));
	}
	
	public static boolean isSubsequence(String s, String t) {
		if(s.length() == 0) {
			return true;
		}
		int s_pointer = 0;
		int t_pointer = 0;
		while(t_pointer < t.length()) {
			if(t.charAt(t_pointer) == s.charAt(s_pointer)) {
				s_pointer++;
			}
			if(s_pointer == s.length()) {
				return true;
			}
			
			t_pointer++;
		}
		return false;
	}

}
