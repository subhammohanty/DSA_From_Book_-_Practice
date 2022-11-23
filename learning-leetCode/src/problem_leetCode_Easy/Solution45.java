package problem_leetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution45 {
	
	public static void main(String[] args) {
		int[] num1 = {4,9,5};
		int[] num2 = {9,4,9,8,4};
		int[] intersection = intersectionTwoPointers(num1, num2);
		for(int n : intersection) {
			System.out.println(n);
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer>map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		
		List<Integer> resList = new ArrayList<Integer>();
		
		for(int val : nums1) {
			if(map1.containsKey(val)) {
				map1.put(val, map1.get(val) + 1);
			}else {
				map1.put(val, 1);
			}
		}
		
		for(int val : nums2) {
			if(map2.containsKey(val)) {
				map2.put(val, map2.get(val) + 1);
			}else {
				map2.put(val, 1);
			}
		}
		
		for(int key : map1.keySet()) {
			if(map2.containsKey(key)) {
				int x = Math.min(map1.get(key), map2.get(key));
				while(x --> 0) {
					resList.add(key);
				}
			}
		}
		List<Integer> collect = resList.stream().distinct().collect(Collectors.toList());
		int[] res = new int[collect.size()];
		for(int i=0; i < res.length; i++) {
			res[i] = collect.get(i);
		}
		return res;
	}
	
	public static int[] intersectionTwoPointers(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0;
		int j = 0;
		Set<Integer> set = new HashSet<Integer>();
		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] == nums2[j]) {
				set.add(nums1[i]);
				i++;
				j++;
			}else if(nums1[i] < nums2[j]) {
				i++;
			}else {
				j++;
			}
		}	
		int[] res = new int[set.size()];
		int k = 0;
		for(int val : set) {
			res[k] = val;
			k++;
		}
		return res;
	}
}
