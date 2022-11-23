package problem_leetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Solution49 {
	
	public static void main(String[] args) {
		System.out.println(findTheDifference("a" , "aa"));
	}
	
	public static char findTheDifference(String s, String t) {
		char c = 0;
		for(char cs : s.toCharArray()) {
			c ^= cs;
		}
		for(char ct : t.toCharArray()) {
			c ^= ct;
		}
		return c;
		
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		for(int i = 0; i< s.length(); i++) {
//			char ch = s.charAt(i);
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}
//		for(int i = 0; i<t.length(); i++) {
//			char ch = t.charAt(i);
//			if(map.containsKey(ch) && map.get(ch) > 0) {
//				map.put(ch, map.get(ch)-1);
//			}else {
//				return ch;
//			}
//		}
//		return ' '; 
	}

}
