package Algorithms;

import java.util.Scanner;

public class FindDate {

	public static void main(String[] args) {
		
		System.out.println("���O�������c��");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������===>");
		int year = sc.nextInt();
		System.out.println("ݔ���·�(1--12)===>");
		int month = sc.nextInt();
		if(month>12||month<1){
			System.out.println("Ոݔ�����_���·�");
		}
		System.out.println("ݔ������(1--31)===>");
		int day = sc.nextInt();
		if(day>31||day<1){
			System.out.println("Ոݔ�����_������");
		}
		int sumDay=0;
		/*switch(month){
		case 1:
			sumDay=day;
			break;
		case 2:
			if(day>29){
				System.out.println("Ոݔ�����_������");
			}
			sumDay = 31+day;
			break;
		case 3:
			sumDay = 31+29+day;
			break;
		case 4:
			sumDay = 31+29+31+day;
			break;
		*//**
		 * 
		 * ʡ�� 5~12��
		 * 
		 **//*
		}*/
		
		//����:
		int[] dayarr = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%400==0||(year%4==0&&year%100 != 0)){
			dayarr[1] = 29;
		for(int i=0;i<month-1;i++){
			day += dayarr[i];
		}
		System.out.println("������===>"+day);
		
		}
		
		
		
	}

}
