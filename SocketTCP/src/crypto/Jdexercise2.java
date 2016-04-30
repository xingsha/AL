package crypto;

import java.util.Scanner;

import Algorithms.FindDate;

public class Jdexercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buffer = null;
		while(!(buffer=sc.nextLine()).equals(" ")){
		String in = sc.nextLine();
		String[] s = in.split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
	    find(n, m);
		}
	
	}
	public static void find(int n, int m){
		boolean flag=true;
			for(int i=n;i<=m;i++){
				int temp = i;
				int a = temp%10;
				temp = temp/10;
				int b = temp%10;
				temp = temp/10;
				if(i == a*a*a + b*b*b + temp*temp*temp){
					flag = false;
					System.out.print(i+" ");
				}
			}
			System.out.println();
			if(flag){
				System.out.println("no");
			}
	}

}
