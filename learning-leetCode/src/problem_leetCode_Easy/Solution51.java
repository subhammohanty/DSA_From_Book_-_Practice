package problem_leetCode_Easy;

public class Solution51 {
	
	public static void main(String[] args) {
		System.out.println(toHex(0));
	}
	
	 public static String toHex(int number) {
		 if(number == 0) {
			 return "0";
		 }
		 
		 long num = number & (-1L >>> 32);
		 StringBuilder sb = new StringBuilder();
		 while(num != 0) {
			 long rem = num % 16;
			 if(rem < 10) {
				 sb.append((char)(48+rem));
			 }else {
				 sb.append((char)(55+rem));
			 }
			 num = num / 16;
		 }
		 return sb.reverse().toString().toLowerCase();
	 }

}
