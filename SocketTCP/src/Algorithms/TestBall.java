package Algorithms;

import java.util.Scanner;

public class TestBall {

	public static void main(String[] args) {
		
		Double height0 = 100.0;
		Double sum = 100.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ش���=====>");
		int k = sc.nextInt();
		if(k==1){
			System.out.println("С���1����ؾ�����·��Ϊ===>150.0");
		}else{
		for(int i=2;i<=k;i++){
			height0 = height0/2;
			sum += 2*height0;
		}
		System.out.println("С���"+k+"����ؾ�����·��Ϊ===>"+height0);
		System.out.println("С���"+k+"����ؾ�������·��Ϊ===>"+sum);
	}
		 
	
	}

}
