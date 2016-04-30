package Algorithms;

import java.util.Scanner;

public class StChar {
	
	static int letternum = 0;
	static int spacenum = 0;
	static int numnum = 0;
	static int othernum = 0;

	public static void main(String[] args) {
		
		System.out.println("ÊäÈë×Ö·û´® ====>");
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		char[] c = s.toCharArray();
		
		for(int i=0;i<c.length;i++ ){
			if(Character.isDigit(c[i])){
				numnum++;
			}else if(Character.isLetter(c[i])){
				letternum++;
			}else if(Character.isSpace(c[i])){
				spacenum++;
			}else{
				othernum++;
			}
				
		}
		System.out.println("letternum ===>"+letternum);
		System.out.println("numnum ===>"+numnum);
		System.out.println("spacenum ===>"+spacenum);
		System.out.println("othernum ===>"+othernum);

	}

}
