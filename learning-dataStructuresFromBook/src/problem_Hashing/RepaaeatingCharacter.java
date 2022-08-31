package problem_Hashing;

import java.util.HashMap;
import java.util.Map;

public class RepaaeatingCharacter {
	
	public static void main(String[] args) {
		char[] s = {'A' ,'S' ,'A' ,'D'};
		System.out.println(repeatingCharacter(s));
	}
	
	public static char repeatingCharacter(char[] s) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i =0; i < s.length; i++) {
			if(map.containsKey(s[i])) {
				return s[i];
			}else {
				map.put(s[i], 1);
			}
		}
		return ' ';
	}

}
