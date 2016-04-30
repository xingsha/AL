package Algorithms;

public class Multi99 {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				
				System.out.print(i+"*"+j+"="+i*j+" ");
				
				
			}
			System.out.println();
		}*/
		//¾ªÑÞµÄËã·¨
		for(int i=1,j=1; j<=9;i++){
			System.out.print(i+"*"+j+"="+i*j+" ");
			
			if(i==j){
				i=0;
				j++;
				System.out.println();
				
			}
			
		}

	}

}
