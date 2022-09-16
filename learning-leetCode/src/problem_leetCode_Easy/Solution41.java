package problem_leetCode_Easy;

public class Solution41 {
	
	public static void main(String[] args) {
		int[] countBits = countBits(5);
		for(int bits : countBits) {
			System.out.println(bits);
		}
	}
	
	public static int[] countBits(int n) {
		int[] res = new int[n+1];
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0 && res[i/2] != 0){
                res[i] = res[i/2];
            }else if(i % 2 != 0 && res[i/2] != 0){
                res[i] = 1 + res[i/2];
            }else{
               res[i] = res(i); 
            }
            
        }
        return res;
	}
	
	public static int res(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return n % 2 == 0 ? res( n / 2) : 1 + res(n/2);
    }

}
