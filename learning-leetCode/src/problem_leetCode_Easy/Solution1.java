package problem_leetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int[] twoSum = twoSumOptimise(nums , 9);
		for(int num : twoSum) {
			System.out.print(num + ",");
		}
	}
	
	public static int[] twoSumOptimise(int[] nums, int target) {
		if (nums == null) {
			return null;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int requiredNumber = target - nums[i];
			if (map.containsKey(requiredNumber)) {
				int[] result = { map.get(requiredNumber), i };
				return result;
			}
			map.put(nums[i], i);
		}
		return null;
	}

	public static int[] twoSum(int[] nums, int target) {
		if (nums == null) {
			return null;
		}
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
	

}
