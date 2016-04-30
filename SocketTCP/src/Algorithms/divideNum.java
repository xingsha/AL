package Algorithms;

public class divideNum {
	
	
	public static void main(String[] args) {
		
		int num = 99;
		int i =2;
		while(i<num){
			if(num%i==0){
				System.out.println(i+";");
				num = num/i;
			}else{
				i++;
				}
			
		}
		System.out.println(num);
		
		
		}
		
		
		
		
	
	

}
