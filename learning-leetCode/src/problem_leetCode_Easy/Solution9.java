package problem_leetCode_Easy;

public class Solution9 {
	
	public static void main(String[] args) {
//		"mississippi"
//		"issip"
		System.out.println(strStr("mississippi", "issip"));
	}
	
	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty()) {return 0;}
        if(haystack.length() == 1 && needle.length() == 1 && haystack.equals(needle)) {
			return 0;
		}
		if(haystack.contains(needle)) {
			String[] strings = haystack.split(needle);
			System.out.println(strings[0]);
			return strings.length > 0 ? strings[0].length() : 0;
		}
		return -1;
	}

}
