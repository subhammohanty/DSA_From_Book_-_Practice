package problem_leetCode_Easy;

public class Solution43 {
	
	public static void main(String[] args) {
		char[] s = {'H','a','n','n','a' ,'h'};
		char[] reverseString = reverseString(s);
		for(char ch : reverseString) {
			System.out.println(ch);
		}
	}
	
	public static char[] reverseString(char[] s) {
		int length = s.length;
		for(int i = 0, j = s.length-1; i <= j; i++,j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		return s;
	}

}
