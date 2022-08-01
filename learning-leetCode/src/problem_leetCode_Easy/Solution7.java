package problem_leetCode_Easy;

public class Solution7 {
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}
	
	
	public static int removeDuplicates(int[] nums) {

		if (nums == null) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		int length = nums.length;
		System.out.println("Length " + length);
		int j =0;
		for(int i = 0; i<length-1; i++) {
			if(nums[i] != nums[i+1]) {
				nums[j++] = nums[i];
			}
		}
		nums[j++] = nums[length-1];
		return j;
	}

}
