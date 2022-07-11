package stack.hackerarth;
import java.io.*;
import java.util.*;


public class TestClass {
	
    public static void main(String[] args){ 
    	
    	int [] arr = {1,2,3,8,6};
    	int k = 0;
    	for(int i =0; i < arr.length-1; i++) {
    		if(arr[i] < arr[i+1]) {
    			k = k^arr[i];
    		}
    	}
    	System.out.println("XOR " + k);
    }      
}
