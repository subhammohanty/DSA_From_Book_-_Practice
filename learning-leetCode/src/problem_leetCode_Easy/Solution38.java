package problem_leetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Solution38 {
	
	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog dog dog dog";
		System.out.println(wordPattern(pattern, s));
	}
	
	public static boolean wordPattern(String pattern, String s) {
		String[] split = s.split(" ");
		if(split.length != pattern.length()) {
			return false;
		}
		Map<Character , String> map = new HashMap<>();
		Map<String, Boolean> map2 = new HashMap<String, Boolean>();
		for(int i=0; i<pattern.length(); i++) {
			if(map.containsKey(pattern.charAt(i))) {
				if(!map.get(pattern.charAt(i)).equalsIgnoreCase(split[i])) {
					return false;
				}
			}else {
				if(map2.containsKey(split[i]) && map2.get(split[i])) {
					return false;
				}
				map.put(pattern.charAt(i) , split[i]);
				map2.put(split[i], true);
			}
		}
		return true;
	}

}
