package Algorithms;

public class PrintPicture {

	public static void main(String[] args) {
		
		int[] arr = {1,3,6,8,6,3,1};
		//int[] arr1 = {0,0,0,0,2,5,7};
		for(int i=0;i<7;i++){
			if(i>=4){
				for(int k=arr[i];k<8;k++){
				System.out.print(" ");
				}
			}
			for(int j=0;j<arr[i];j++){
				System.out.print("*");
					
			}
			System.out.println();					
		}
	}
}


