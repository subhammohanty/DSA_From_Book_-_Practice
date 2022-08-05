package problem_leetCode_Easy;

import java.math.BigInteger;
import java.util.Stack;

public class Solution13 {
	
	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}

	public static String addBinary(String a, String b) {
		int alen = a.length();
		int blen = b.length();
		int i =0;
		int carry = 0;
		StringBuilder result = new StringBuilder();
		while(i<alen || i<blen || carry != 0) {
			int x = 0;
			if(i<alen && a.charAt(alen-1-i) == '1') {
				x = 1;
			}
			int y = 0;
			if(i<blen && b.charAt(blen-1-i) == '1') {
				y = 1;
			}
			result.append((x+y+carry)%2);
			carry = (x+y+carry)/2;
			i++;
		}
		return result.reverse().toString();
	}
	
}
