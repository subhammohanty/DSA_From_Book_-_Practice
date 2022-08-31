package problem_leetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Solution22 {
	
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		return map.entrySet().stream().filter(a -> a.getValue() == 1).findFirst().get().getKey();
	}

}
