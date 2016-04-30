package Algorithms;

import java.util.Date;



public class NextDate {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		
		long now1 = now.getTime();
		
		now1 = now1 + 24*60*60*1000;
		
		Date now2 = new Date(now1);
		
		System.out.println(now2);
		
		
	}

}
