package problem_leetCode_Easy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		int num = 11;
		int sum = 0;
		while(num != 0) {
			sum += num%10;
			num = num / 10;
		}
		System.out.println(sum);
	}	
}
