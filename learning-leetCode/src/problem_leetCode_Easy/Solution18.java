package problem_leetCode_Easy;

import java.util.ArrayList;
import java.util.List;

public class Solution18 {
	
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
	
	public static List<List<Integer>> generate(int numRows) {
		if(numRows == 0) {
			return null;
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i =0; i<numRows; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j < i+1; j++) {
				if(j == 0 || j == i) {
					list.add(1);
				}else {
					list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
				}
			}
			res.add(list);
		}
		return res;
	}

}
