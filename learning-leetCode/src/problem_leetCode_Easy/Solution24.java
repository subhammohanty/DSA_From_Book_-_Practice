package problem_leetCode_Easy;

import java.util.HashMap;
import java.util.Map;

public class Solution24 {
	
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			}else {
				map.put(nums[i], 1);
			}
		}
		return map.entrySet().stream()
		.filter(obj -> obj.getValue() > nums.length / 2).findAny().get().getKey();
	} 
}
