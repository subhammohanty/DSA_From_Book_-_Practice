package problem_leetCode_Easy;

public class Solution23 {
	
public static void main(String[] args) {
		
		System.out.println(convertToTitle(27));
	}
	
	public static String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		while(columnNumber > 0) {
			int ques = columnNumber % 26;
			columnNumber = columnNumber/ 26;
			if(ques == 0) {
				sb.append('Z');
				columnNumber--;
			}else {
				sb.append((char)(64+ques));
			}
		}
		sb = sb.reverse();
		return sb.toString();
	}

}
