package Algorithms;

import java.util.Scanner;

public class Nixv {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数字(<99999)===>");
		String s = sc.nextLine();
		System.out.println(s.length()+"位数");
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		
		/*int a = sc.nextInt();
		int a2 = a/10000;
		int a3 = (a%10000)/1000;
		int a4 = (a%1000)/100;
		int a5 = (a%100)/10;
		int a6 = a%10;
		
		
		if(a2>0){
			System.out.println("是一个5位数"+a6+a5+a4+a3+a2);
		}else if(a/1000>0){
			System.out.println("是一个4位数"+a6+a5+a4+a3);			
		}else if(a/100>0){
			System.out.println("是一个3位数"+a6+a5+a4);			
		}else if(a/10>0){
			System.out.println("是一个2位数"+a6+a5);			
		}else {
			System.out.println("是一个1位数"+a6);			
		}
		*/

	}

}
