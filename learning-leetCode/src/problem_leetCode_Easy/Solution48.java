package problem_leetCode_Easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution48 {
	
	public static void main(String[] args) {
		System.out.println(firstUniqChar("aabb"));
	}
	
	public static int firstUniqChar(String s) {
		Map<Character, Boolean> mapKey = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (mapKey.containsKey(s.charAt(i))) {
				mapKey.put(s.charAt(i), false);
			} else {
				mapKey.put(s.charAt(i), true);
			}
		}		
		 return (mapKey.entrySet().stream()
		.filter(m1 -> m1.getValue()).findFirst())
		.map(entrySet -> entrySet.getKey()).map(key -> s.indexOf(key)).orElse(-1);
		
	}

}
