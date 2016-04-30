package Algorithms;

import java.util.Scanner;

public class TestBall {

	public static void main(String[] args) {
		
		Double height0 = 100.0;
		Double sum = 100.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入落地次数=====>");
		int k = sc.nextInt();
		if(k==1){
			System.out.println("小球第1次落地经过的路程为===>150.0");
		}else{
		for(int i=2;i<=k;i++){
			height0 = height0/2;
			sum += 2*height0;
		}
		System.out.println("小球第"+k+"次落地经过的路程为===>"+height0);
		System.out.println("小球第"+k+"次落地经过的总路程为===>"+sum);
	}
		 
	
	}

}
