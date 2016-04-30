package Algorithms;

public class Huiwenshuzi {

	public static void main(String[] args) {
		
		/*for(int i=10;i<1000;i++){
			int temp = 0;
			int num = i;
			while(num>0){
				temp = temp*10 + num%10;
				num = num/10;
			
			}
			System.out.println(temp+"==>"+i);
			if(temp == i){
				System.out.println("回文数字=========>"+i);
			}
		}*/
		
		//底层执行复杂
		for(int i=10;i<1000;i++){
			String num = String.valueOf(i);
			StringBuffer sb = new StringBuffer(num);
			boolean temp = sb.reverse().toString().equals(num);
			if(temp){
				System.out.println("回文数字=========>"+i);
			}
		}
		

	}

}
