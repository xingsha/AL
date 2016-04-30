package Algorithms;


public class rabbit {
	
	
	public static int f(int x){
		if(x>=2){
			return f(x-1)+f(x-2);
			
		}else
			return 1;
	}
	

	public static void main(String[] args) {
		
		
		
		System.out.println(f(15));
		
	}
}
