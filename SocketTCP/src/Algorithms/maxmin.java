package Algorithms;

import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		System.out.println("���� m,n =====>");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		if(m<n){
			int temp = n;
			n = m;
			m = temp;
		}
		int gc=gcd(m,n);
		System.out.println("���Լ��"+gc);
		System.out.println("��С������"+n*m/gc);
		

	}
	
	public static int gcd(int m, int n){
		int c=0;
		
		while(!(m%n==0)){
			int temp = m%n;
			m = n;
			n = temp;
		}
		c =n ;
		
		return c;
	}

}
