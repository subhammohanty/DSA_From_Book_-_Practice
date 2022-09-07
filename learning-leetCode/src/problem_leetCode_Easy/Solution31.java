package problem_leetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution31 {
	
	public static void main(String[] args) {
		int[] nums = {0,1,2,4,5,7};
		System.out.println(summaryRanges(nums));
	}
	
	public static List<String> summaryRanges(int[] nums) {
		if(nums == null) {
			return null;
		}
		List<String> res = new ArrayList<String>();
		int i = 0;
		while(i < nums.length) {
			int start = nums[i];
			List<Integer> list = new ArrayList<Integer>();
			while(i < nums.length && nums[i] == start) {
				list.add(nums[i]);
				i++;
				start++;
			}
			if(list.size() > 1) {
				res.add(list.get(0).toString()+"->"+list.get(list.size()-1).toString());
			}else {
				res.add(list.get(0).toString());
			}
		}
		return res;		
	}

}
