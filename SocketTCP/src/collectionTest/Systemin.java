package collectionTest;

import java.awt.event.MouseWheelEvent;
import java.util.Arrays;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Systemin {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//String rs1=scanner.nextLine();
		/*String rs1 = "24 45 6 89 1";
		System.out.println(rs1);
		String[] rs2=rs1.split(" ");
        System.out.println(Arrays.toString(rs2));
        int[] num = new int[rs2.length];
        for(int i=0;i<rs2.length;i++){
        	try {
        		num[i]=Integer.parseInt(rs2[i]);
			} catch (Exception e) {
				System.out.println("输入非法");
				
			}
        	
        }
        System.out.println(Arrays.toString(num));
        for(int i=0;i<rs1.length();i++)
        	System.out.println(rs1.charAt(i));*/
//================********************************========================================
        String A = "ahbhgyakuw";
        String B = "yuwehgyansadh";
        int num=largest(A, B);
        System.out.println("largest=====>"+num);
	
	}
public static int largest(String A,String B){
		int a = A.length();
		int b = B.length();
		int num = 0;
		int[][] dp = new int[a+1][b+1];
		
		for(int i=1;i<=a;i++){
			char c1 = A.charAt(i-1);
			for(int j=1;j<=b;j++){
				char c2 = B.charAt(j-1);
				if(c1 == c2){
					dp[i][j] = dp[i-1][j-1] + 1;
				}else{
					dp[i][j] = 0;
				}
				num = Math.max(num, dp[i][j]);
			}
		}
		return num;

}
}
