package problem_leetCode_Medium;

import java.util.HashSet;

public class Solution2 {

	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));
	}


	public static int lengthOfLongestSubstring(String s) {
		int i = 0;
		int j = 0;
		int max = 0;
		HashSet<Character> set = new HashSet<Character>();
		while(j < s.length()) {
			char ch = s.charAt(j);
			if(!set.contains(ch)) {
				set.add(ch);
				max = Math.max(max, set.size());
				j++;
			}else {
				set.remove(s.charAt(i));
				i++;
			}			
		}
		return max;
	}

}
