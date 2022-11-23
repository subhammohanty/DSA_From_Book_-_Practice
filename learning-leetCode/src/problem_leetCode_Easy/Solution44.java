package problem_leetCode_Easy;

public class Solution44 {
	
	public static void main(String[] args) {
		System.out.println(reverseVowels("aA"));
	}
	
	public static String reverseVowels(String s) {
		char[] charArray = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 , j = charArray.length-1; i <= j;) {
			char p1 = charArray[i];
			char p2 = charArray[j];
			if(isVowel(p1) && isVowel(p2)) {
				charArray[i] = p2;
				charArray[j] = p1;
				i++;j--;
			}else if(isVowel(p2) && !isVowel(p1)) {
//				sb.append(charArray[i]);
				i++;
			}else if(isVowel(p1) && !isVowel(p2)) {
//				sb.append(charArray[j]);
				j--;
			}else {
//				sb.append(charArray[i]);
//				sb.append(charArray[j]);
				i++;
				j--;
			}
		}
		for(char ch : charArray) {
			sb.append(ch);
		}
		return sb.toString();
	}
	
	public static boolean isVowel(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
				);
	}

}
