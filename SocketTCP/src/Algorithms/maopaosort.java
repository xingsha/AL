package Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class maopaosort {

	public static void main(String[] args) {
		
		int[] arr = {2,5,54,67,1,32,12,90,10,3};
		int i=0;
		int j = 0;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
