package problem_leetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Solution53 {
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("abtyytlcclab"));
	}
	
	public static int longestPalindrome(String s) {
//		if(s.length() == 1) {
//			return 1;
//		}
//		Map<Character, Integer> map = new HashMap<>();
//		for(char ch : s.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}
//		int ans = 0;
//		boolean isFirstOdd= true;
//		for(int value : map.values()) {
//			if(value % 2 == 0) {
//				ans += value;
//			}else {
//				if(isFirstOdd) {
//					ans += value;
//					isFirstOdd = false;
//				}else {
//					ans += (value-1);
//				}
//			}
//		}
//		return ans;
		
		int[] lowerCase = new int[26];
		int[] upperCase = new int[26];
		
		for(char ch : s.toCharArray()) {
			if((ch - 97) >= 0) {
				lowerCase[ch-97]++;
			}else {
				upperCase[ch-65]++;
			}
		}
		
		int ans = 0;
		boolean isFirstOdd = true;
		for(int i = 0; i < 26; i++) {
			if(lowerCase[i] % 2 == 0) {
				ans += lowerCase[i];
			}else {
				if(isFirstOdd) {
					ans += lowerCase[i];
					isFirstOdd = false;
				}else {
					ans += lowerCase[i] - 1;
				}
			}
			
		}
		
		for(int i = 0; i < 26; i++) {
			if(upperCase[i] % 2 == 0) {
				ans += upperCase[i];
			}else {
				if(isFirstOdd) {
					ans += upperCase[i];
					isFirstOdd = false;
				}else {
					ans += upperCase[i] - 1;
				}
			}
			
		}
		return ans;	
	}

}
