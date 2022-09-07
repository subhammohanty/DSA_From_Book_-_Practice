package problem_leetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,5);
		List<String> res = new ArrayList<String>();
		res.add(list.get(0).toString());
		res.add("->");
		res.add(list.get(list.size()-1).toString());
		System.out.println(res);
	}
	
	
	
}
