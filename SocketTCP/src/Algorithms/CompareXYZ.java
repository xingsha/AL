package Algorithms;

import java.util.Scanner;

public class CompareXYZ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����X");
		int x = sc.nextInt();
		System.out.println("����Y");
		int y = sc.nextInt();
		System.out.println("����Z");
		int z = sc.nextInt();
		
		if(x<y){
			x = x^y;
			y = x^y;
			x = y^x;
		}
		if(x<z){
			x = x^z;
			z = x^z;
			x = z^x;
		}
		if(y<z){
			y = y^z;
			z = y^z;
			y = z^y;
		}
		
		System.out.println(x+">"+y+">"+z);

	}

}
