package problem_leetCode_Easy;

public class Solution20 {
	
	public static void main(String[] args) {
		int[] prices = {2,4,1};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		int minSoFar = prices[0];
		int maxProfit = 0;
		for(int i=0; i<prices.length; i++) {
			minSoFar = Math.min(minSoFar, prices[i]);
			int profit = prices[i] - minSoFar;
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
	}
	
	

}
