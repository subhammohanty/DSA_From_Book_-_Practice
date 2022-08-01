package problem_leetCode_Easy;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Solution10 {
	
	public static void main(String[] args) {
		int[] nums = {2,3,4,7,8,9};
		System.out.println(searchInsertOptimise(nums, 11));
	}
	
	public static int searchInsert(int[] nums, int target) {
		if(nums == null) {return 0;}
		int length = nums.length;
		
		 OptionalInt findFirst = IntStream.range(0, length)
				.filter(num -> nums[num] == target)
				.findAny();
		 if(findFirst.isPresent()) {
			 return findFirst.getAsInt();
		 }
		 if(target > nums[length-1]) {return length;}
		 for(int i =0; i< nums.length; i++) {
			 if(target-1 == nums[i]) {
				 return i+1;
			 }else if(target+1 == nums[i]) {
				 return i;
			 }
		 }
		 return 0;
	}
	
	public static int searchInsertOptimise(int[] nums , int target) {
		if(nums == null) {return 0;}
		for(int i = 0; i < nums.length; i++) {
			if(target == nums[i]) {
				return i;
			}else if(target < nums[i]) {
				return i;
			}else if(i == nums.length - 1) {
				return nums.length;
			}
		}
		return -1;
	}

}
