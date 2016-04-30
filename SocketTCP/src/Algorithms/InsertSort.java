package Algorithms;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		
		int[] arr = {21,3,4,56,14,77,42,20,68,67};
		
		for(int i=1;i<arr.length;i++){
			while(i>0){
				if(arr[i]<arr[i-1]){
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					i--;
				}else{
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
