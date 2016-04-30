package Algorithms;

public class DaffodilNumber {
	
	

	public static void main(String[] args) {
		
		for(int i=100;i<1000;i++){
			int a=i/100;
			int i1 = i - a*100;
			int b = i1/10;
			int i2 = i1 - b*10;
			int c = i2;
			int z = a*a*a + b*b*b + c*c*c;
			if(z==i){
				System.out.println(i+"是 水仙花数");
			}
		}

	}

}
