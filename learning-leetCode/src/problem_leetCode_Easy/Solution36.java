package problem_leetCode_Easy;

import java.util.stream.IntStream;

public class Solution36 {
	
	public static void main(String[] args) {
		int[] nums = {1,2};
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
		int n = nums.length;
		return (n * (n+1) / 2 - IntStream.of(nums).sum());
	}

}
