package stack.hackerarth;

public class JumpyHumpy {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3, 8,6};
		System.out.println(jump(null));
	}

	public static int jump(int[] arr) {
		for(int i =0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				int xor = 0;
				if(arr[i] < arr[j]) {
					xor = arr[i]^arr[j];
				}
			}
		}
	}
}
