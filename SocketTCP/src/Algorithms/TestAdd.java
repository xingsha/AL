package Algorithms;

import java.util.Scanner;

public class TestAdd {

	public static void main(String[] args) {
		
		System.out.println("输入相加项数===>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("输入整数(0--9)===>");
		int a = scanner.nextInt();
		
		/*int a = 2;
		int num = 3;*/
		double s = 0;
		double sum = 0;
		for(int i=0;i<num;i++){
			s+=a*Math.pow(10, i);
			sum += s;
			System.out.println(s);
		}
		System.out.println("final=====>"+sum);
	
	}

}
