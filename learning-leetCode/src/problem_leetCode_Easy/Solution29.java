package problem_leetCode_Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution29 {

	public static void main(String[] args) {
		int nums[] = { 1, 0, 1, 1 };
		System.out.println(containsNearbyDuplicate(nums, 2));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int absValue = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				absValue = Math.abs(map.get(nums[i]) - i);
				if (absValue <= k) {
					return true;
				} else {
					map.put(nums[i], i);
				}
			} else {
				map.put(nums[i], i);
			}
		}
		return false;
	}

}
