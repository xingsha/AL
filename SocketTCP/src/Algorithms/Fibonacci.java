package Algorithms;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		
		double sum = 0;
		
		int[] arr1= new int[20];
		int[] arr2= new int[20];
		arr1[0] = 2;
		arr1[1] = 3;
		arr2[0] = 1;
		arr2[1] = 2;
		
		for(int i=2;i<20;i++){
			
			arr1[i] = arr1[i-1]+arr1[i-2];
		}
		for(int i=2;i<20;i++){
			
			arr2[i] = arr2[i-1]+arr2[i-2];
		}
			 System.out.println(Arrays.toString(arr1));
			 System.out.println(Arrays.toString(arr2));
		
			 for(int i=0;i<20;i++){
				 sum += arr1[i]/arr2[i];
			 }
	
	      System.out.println(sum);
	
	}

}
