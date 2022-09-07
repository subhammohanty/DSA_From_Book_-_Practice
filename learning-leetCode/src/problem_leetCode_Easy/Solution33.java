package problem_leetCode_Easy;

public class Solution33 {
	
	public static void main(String[] args) {
		String s = "rat";
		String t = "car";
		System.out.println(isAlagram(s, t));
	}
	
	public static boolean isAlagram(String s , String t) {
		if(s == null || t == null) {
			return true;
		}
		if(s.length() != t.length()) {
			return false;
		}
		for(int i = 0; i < t.length(); i++) {
			if(!s.contains(String.valueOf(t.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

}
