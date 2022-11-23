package problem_leetCode_Easy;

import java.util.ArrayList;
import java.util.List;

public class Solution52 {

	public static void main(String[] args) {
		System.out.println(readBinaryWatch(2));
	}

	public static List<String> readBinaryWatch(int turnedOn) {
		List<String>list = new ArrayList<>();
		for(int hours = 0; hours <= 11; hours++) {
			for(int minutes = 0; minutes <= 59; minutes++) {
				if(Integer.bitCount(hours) + Integer.bitCount(minutes) == turnedOn) {
					String newTime = hours + ":";
					if(minutes < 10) {
						newTime += "0";
					}
					newTime += minutes;
					list.add(newTime);
				}
			}
		}
		return list;
	}

}
