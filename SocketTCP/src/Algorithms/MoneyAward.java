package Algorithms;

import java.util.Scanner;

public class MoneyAward {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ý”Èëª„½ð”µ======>");
		Double money = sc.nextDouble();
		double award = 0;
		if(money<=10){
			award = money/10;
		}else if(money<=20){
			award = 10*10/100 + (money-10)*(7.5)/100;
		}else if(money<=40){
			award = 10*10/100 + 10*(7.5)/100 + (money-20)*5/100;
		}else if(money<=60){
			award = 10*10/100 + 10*(7.5)/100 + (20)*5/100 + (money-40)*3/100;
		}else if(money<=100){
			award = 10*10/100 + 10*(7.5)/100 + (20)*5/100 + (20)*3/100 + (money-60)*1.5/100;
		}else{
			award = 10*10/100 + 10*(7.5)/100 + (20)*5/100 + (20)*3/100 + (40)*1.5/100 + (money-100)/100;
		}
		
		System.out.println("award="+award);

	}

}
