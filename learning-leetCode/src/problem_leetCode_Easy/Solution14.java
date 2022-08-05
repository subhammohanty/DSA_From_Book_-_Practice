package problem_leetCode_Easy;

public class Solution14 {
	
	public static void main(String[] args) {
		System.out.println(mySqrt(25));
	}
	
	public static int mySqrt(int x) {
		int start = 1;
		int end = x;
		while(start <= end) {
			int mid = (start + (end - start))/2;
			if(mid <= x / mid) {
				start = mid + 1;
			}else {
				end = mid-1;
			}
		}
		return end;
	}

}
