package Algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {55,12,67,45,4,87,13,43,90,37};
		
		QuickSort(arr,0,arr.length-1);
		//quick_sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
 
	
	public static void QS(int[] arr, int low, int high){
		
		if(low<high){
			int temp = arr[low];
			int left = low;
			int right = high;
			while(left<right){
				
				while(left<right&&arr[right]>=temp){
					right--;
				}
				if(left<right){
					arr[left] = arr[right];
					left++;
				}
				
				while(left<right&&arr[left]<temp){
					left++;
				}
				if(left<right){
					arr[right] = arr[left];
					right--;
				}
			}
			arr[left] = temp;
			QS(arr,low,right-1);
			QS(arr,right+1,high);
		}
		
	} 
	public static void QuickSort(int[] arr, int low, int high){
		
		if(low < high){
			int temp = arr[low];
			int right = high;
			int left = low;
			while(left<right){
				
				while(left<right && arr[right]>=temp){
					right--;
				}
				if(left<right){
					arr[left] = arr[right];
					left++;
				}
				while(left<right && arr[left]<temp){
					left++;
				}
				if(left<right){
					arr[right] = arr[left];
					right--;
				}
			}
			arr[left] = temp;
			QuickSort(arr, low, right-1);
			QuickSort(arr, right+1,high);
		}
	}

}
