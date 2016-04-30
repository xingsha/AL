package Algorithms;

public class Sushu {

	public static void main(String[] args) {
		for(int i=2;i<=100;i++){
			int j=2;
			int flag = 0;
			int k=(int)Math.sqrt(i);
			for(j =2;j<=k;j++){
				if(i%j==0){
					flag =1;
					break;
					
				}
				
				
			}
			if(flag==0){
				System.out.print(i+",");
			}
			
			
		}

	}

}
