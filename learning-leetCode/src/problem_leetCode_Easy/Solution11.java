package problem_leetCode_Easy;

public class Solution11 {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" fly me   to   the moon "));
	}
	
	public static int lengthOfLastWord(String s) {
		if(s.isEmpty() || s.isBlank()) {
			return -1;
		}
		String[] split = s.trim().split(" ");
		int length = split[split.length-1].length();
		return length;
	}

}
