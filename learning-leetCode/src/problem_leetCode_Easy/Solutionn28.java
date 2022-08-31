package problem_leetCode_Easy;

import java.util.Arrays;

public class Solutionn28 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(containsDuplicate(nums));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length == 1) {
			return false;
		}
		Arrays.sort(nums);
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
		}
		return false;
	}

}
