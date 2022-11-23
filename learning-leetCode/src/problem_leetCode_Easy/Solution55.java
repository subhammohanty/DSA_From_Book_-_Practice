package problem_leetCode_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class Solution55 {
	
	public static void main(String[] args) {
		int[] nums = {3,2,1};
		//10,30,40,50,60
		System.out.println(thirdMax(nums));
	}
	
	public static  int thirdMax(int[] nums) {
//		if(nums.length < 3) {
//			return nums[nums.length-1];
//		}
//		int k = 3;
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		for(int i = 0 ; i < k; i++) {
//			pq.add(nums[i]);
//		}
//		for(int i = k; i < nums.length; i++) {
//			if(pq.peek() < nums[i]) {
//				pq.poll();
//				pq.add(nums[i]);
//			}
//		}
//		return pq.peek();
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		if(list.size() < 3) {
			return list.get(list.size()-1);
		}else {
			return list.get(list.size()-3);
		}
	}

}
