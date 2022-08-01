package problem_leetCode_Easy;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		String s1 = "luffy is still joyboy";
//		System.out.println(s1.trim());
		String[] split = s1.trim().split(" ");
//		System.out.println(split.length);
		System.out.println(split[split.length-1].length());

	}

}
