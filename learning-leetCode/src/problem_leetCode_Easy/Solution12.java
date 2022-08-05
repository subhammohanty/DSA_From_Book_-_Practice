package problem_leetCode_Easy;

public class Solution12 {
	
	public static void main(String[] args) {
		int[] digits = {8,9,9,9};
		int[] plusOne = plusOne(digits);
		for(int i =0; i<plusOne.length; i++) {
			System.out.println(plusOne[i]);
		}
	}
	
	public static int[] plusOne(int[] digits) {
		if (digits == null) {
			return null;
		}
		int length = digits.length;
		for(int i = length-1; i >= 0; i--) {
			if(digits[i] != 9) {
				digits[i] = digits[i] + 1;
				break;
			}else {
				digits[i] = 0;
			}
		}
		if(digits[0] == 0) {
			int[] newArray = new int[length + 1];
			newArray[0] = 1;
			return newArray;
		}
		return digits;
	}

}
