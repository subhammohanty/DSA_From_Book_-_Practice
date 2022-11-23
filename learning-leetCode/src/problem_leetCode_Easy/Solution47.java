package problem_leetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Solution47 {
	
	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "aab"));
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i =0; i<ransomNote.length(); i++) {
        	if(map.containsKey(ransomNote.charAt(i))) {
        		map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) + 1);
        	}else {
        		map.put(ransomNote.charAt(i), 1);
        	}
        }
        
        for(int i =0; i<magazine.length(); i++) {
        	if(map2.containsKey(magazine.charAt(i))) {
        		map2.put(magazine.charAt(i), map2.get(magazine.charAt(i)) + 1);
        	}else {
        		map2.put(magazine.charAt(i), 1);
        	}
        }
        
        for(char key : map.keySet()) {
        	if((!map2.containsKey(key)) || (map.get(key) > map2.get(key))) {
        		return false;
        	}
        }
        return true;
    }

}
