package Algorithms;

public class wanshu {

	public static void main(String[] args) {
		
		int sum = 1;
		int num = 0;
		int i = 0;
		for(i=1;i<=1000;i++){
			num = i;
			sum = 1;
			for(int j = 2;j < num;j++){
				if(num%j==0){
					sum += j;
				}
			}
			
			if(sum==num){
				System.out.println("1000以内的完数有=====>"+num+",");
			}
		}	 
	}

}
