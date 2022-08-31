package problem_leetCode_Easy;

import java.util.ArrayList;
import java.util.List;

public class Solution19 {
	public static void main(String[] args) {
		System.out.println(pasalII(3));
	}
	
	public static List<Integer> pasalII(int rowIndex){
		List<List<Integer>> res = new ArrayList<>();
		for(int i =0; i<=rowIndex; i++) {
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
		return res.get(rowIndex);
	}

}
