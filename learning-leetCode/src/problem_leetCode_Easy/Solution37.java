package problem_leetCode_Easy;

public class Solution37 {
	
	public static void main(String[] args) {
		int[] nums = {0,1,3,0,12};
		int[] moveZeroes = moveZeroes(nums);
		for(int num : moveZeroes) {
			System.out.println(num);
		}
	}
	
//	Without Optimisation.
	public static int[] moveZeroes(int[] nums) {
		 int[] num1 = new int[nums.length];
	        int[] num2 = new int[nums.length];
	        int j=0, k=0;
	        for(int i = 0; i<nums.length; i++){
	            if(nums[i] != 0){
	                num1[j] = nums[i];
	                j++;
	            }else{
	                num2[k] = nums[i];
	                k++;
	            }
	        }
	        for(int i =0; i<j; i++){
	            nums[i] = num1[i];
	        }
	        for(int i = 0; i < k; i++,j++){
	            nums[j] = num2[i];
	        }
	        return nums;
	} 

}
