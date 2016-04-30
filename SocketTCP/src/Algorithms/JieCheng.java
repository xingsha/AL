package Algorithms;

public class JieCheng {

	public static void main(String[] args) {
		
		long sum=0;
		for(int i=1;i<=20;i++){
			sum += JC(i);
			//System.out.println(JC(i));
		}
		System.out.println(sum);

		 
	}
	
	public static long JC(int a){
		
		long ja = 1;
		for(int i=1;i<=a;i++){
			ja = ja*i;
		}
		
		
		return ja;
		
	}

}
