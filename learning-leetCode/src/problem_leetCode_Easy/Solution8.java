package problem_leetCode_Easy;

public class Solution8 {
	
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums, 2));
	}
	
	public static int removeElement(int[] nums, int val) {
		int j =0;
		for(int i =0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[j++] = nums[i];
			}
		}
		for(int i=0; i<j; i++) {
			System.out.println(nums[i]);
		}
		return j;
	}

}
