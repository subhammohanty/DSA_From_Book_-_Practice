package problem_leetCode_Easy;

public class Solution46 {
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(14));
		System.out.println(isPerfectSquareUsingRecurssion(14,1,14/2));
	}
	
	public static boolean isPerfectSquare(int num) {
        if(num == 1) {
        	return true;
        }
        int low = 1;
        int high = num / 2;
        while(low <= high) {
        	int mid = low + (high-low) / 2;
        	if((mid == num / mid) && (num % mid == 0)) {
        		return true;
        	}else if(mid < num / mid) {
        		low = mid + 1;
        	}else {
        		high = mid - 1;
        	}
        }
        return false;
    }
	
	public static boolean isPerfectSquareUsingRecurssion(int num , int low , int high) {
		if (num == 1) {
			return true;
		}
		if (low > high) {
			return false;
		}
		int mid = low + (high - low) / 2;
		if ((mid == num / mid) && (num % mid) == 0) {
			return true;
		} else if (mid < num / mid) {
			return isPerfectSquareUsingRecurssion(num, mid + 1, high);
		} else {
			return isPerfectSquareUsingRecurssion(num, low, mid - 1);
		}
	}

}
