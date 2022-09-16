package problem_leetCode_Easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution33 {
	
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAlagram(s, t));
	}
	
	public static boolean isAlagram(String s , String t) {
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		if(s == null || t == null) {
			return true;
		}
		if(s.length() != t.length()) {
			return false;
		}
		for(int i = 0; i < t.length(); i++) {
			map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
			map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
		}

				
		for(Character ch : map1.keySet()) {
			int val1 = map1.get(ch);
			int val2 = map2.getOrDefault(ch, 0);
			if(val1 != val2) {
				return false;
			}
		}
		return true;
	}

}
