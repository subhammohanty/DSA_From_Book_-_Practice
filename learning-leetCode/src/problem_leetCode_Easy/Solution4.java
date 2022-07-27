package problem_leetCode_Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution4 {
	
	
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestPrefix(strs));
	}
	
	public static String longestPrefix(String[] strs) {
		if(strs.length == 0) {return "";}
		String prefix = strs[0];
		StringBuilder sb = new StringBuilder();
		if(prefix == null) {return "";}
		
		for(int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			for(int j = 1; j < strs.length; j++) {
				if(strs[j].length() <= i || ch != strs[j].charAt(i)) {
					return sb.toString();
				}
			}
			sb.append(ch);
		}
		
		return sb.toString();
	}

}
