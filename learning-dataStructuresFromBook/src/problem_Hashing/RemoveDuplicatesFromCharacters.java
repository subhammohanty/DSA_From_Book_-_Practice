package problem_Hashing;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromCharacters {
	
	public static void main(String[] args) {
		char[] chars = {'A' , 'B' , 'B' , 'D' , 'C' , 'D'};
		char[] removeDuplicates = removeDuplicates(chars, chars.length);
		for(char chr : removeDuplicates) {
			System.out.println(chr);
		}
	}
	
	public static char[] removeDuplicates(char[] chars, int len) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if (!map.containsKey(chars[i])) {
				map.put(chars[i], 1);
				sb.append(chars[i]);
			} else {
				map.put(chars[i], map.get(chars[i]) + 1);
			}
		}
		return sb.toString().toCharArray();
	} 

}
