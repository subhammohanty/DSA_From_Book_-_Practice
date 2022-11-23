package problem_leetCode_Medium;

import java.util.PriorityQueue;

public class Solution1 {
	
	public static void main(String[] args) {
		int nums[] = {3,2,1,5,6,4};
		System.out.println(findKthLargest(nums, 2));
	}
	
	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++) {
        	pq.add(nums[i]);
        }
        for(int i=k; i<nums.length; i++) {
        	if(pq.peek()<nums[i]) {
        		pq.poll();
        		pq.add(nums[i]);
        	}
        }
        return pq.peek();
    }

}
