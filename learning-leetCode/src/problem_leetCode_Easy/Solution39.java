package problem_leetCode_Easy;

public class Solution39 {
	
	public static void main(String[] args) {
		System.out.println(canWinNim(5));
	}
	
	public static boolean canWinNim(int n) {
		if(n <= 3) {
			return true;
		}
		int ques = n/2;
		int res = ques - 3;
		if((res % 2 == 0) || (res % 3 == 0) || res < 0) {
			return true;
		}else if(res == 1) {
			return false;
		}
		return false;
	}

}
