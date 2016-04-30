package Algorithms;

public class FindNum {

	public static void main(String[] args) {
		//int a,b;
		
		for(int i=1;i<10000;i++){
			/*a= (int) Math.sqrt(i+100);
			if(a*a==i+100){
				b=(int) Math.sqrt(i+268);
				if(b*b==i+268){
					System.out.println("ß@‚€”µ×ÖÊÇ==>"+i);
				}
			}*/
			if(Math.sqrt(i+100)%1==0&&Math.sqrt(i+100+168)%1==0){
				System.out.println("ß@‚€”µ×ÖÊÇ==>"+i);
			}
		}

	}

}
