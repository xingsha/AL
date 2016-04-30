package Algorithms;

public class TestTN {

	public static void main(String[] args) {
		
		//方一:
		/*for(int i = 1;i<=4;i++){
			int sum = i*100;
			for(int j =1;j<=4;j++){
				if(!(j==i)){
					int	sum1 = sum+ j*10;
				
					for(int k=1;k<=4;k++){
						if(!(j==k||k==i)){
						int sum2 =sum1+ k;
						//System.out.println(sum2);
						}
						
					}
				}
			}
		}*/
		
		//方二:
		for(int a =1;a<=4;a++){
			for(int b=1;b<=4;b++){
				for(int c=1;c<=4;c++){
					if(a!=b&&b!=c&&c!=a){
						System.out.println(a+""+b+""+c);
					}
				}
			}
		}
	}

}


