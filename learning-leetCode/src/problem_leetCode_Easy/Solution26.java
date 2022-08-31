package problem_leetCode_Easy;

import java.util.HashMap;

public class Solution26 {
	
	public static void main(String[] args) {
		System.out.println(isIsomerPhic("foo", "bar"));
	}
	
	public static boolean isIsomerPhic(String s , String t) {
		if(s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Boolean> map2 = new HashMap<>();
		for(int i =0; i<s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if(map1.containsKey(c1)) {
				if(map1.get(c1) != c2) {
					return false;
				}
			}else {
				if(map2.containsKey(c2)) {
					return false;
				}else {
					map1.put(c1, c2);
					map2.put(c2, true);
				}
			}
		}
		return true;
	}

}
