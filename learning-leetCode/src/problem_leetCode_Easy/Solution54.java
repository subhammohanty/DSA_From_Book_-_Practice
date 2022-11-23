package problem_leetCode_Easy;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
	
	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}
	
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
        	if((i % 3 == 0) && (i % 5 == 0) && list.size() != n) {
        		list.add("FizzBuzz");
        	}else if(i % 3 == 0 && list.size() != n) {
        		list.add("Fizz");
        	}else if(i % 5 == 0 && list.size() != n) {
        		list.add("Buzz");
        	}else{
        		if(list.size() != n) {
        			list.add(String.valueOf(i));
        		}
        	}
        }
        return list;
    }

}
