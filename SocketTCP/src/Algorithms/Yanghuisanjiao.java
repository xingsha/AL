package Algorithms;

import java.util.Scanner;

public class Yanghuisanjiao {

	public static void main(String[] args) {
		/* System.out.println("«Î ‰»Î–– ˝£∫");
	        Scanner sc = new Scanner(System.in);
	        int line = sc.nextInt();
	        int[] a = new int[line];
	        for (int i = 0; i < line; i++) {
	            a[i] = 1;
	        }
	        if (line == 1) {
	            System.out.println(1);
	        } else if (line == 2) {
	            System.out.println(1);
	            System.out.println(1 + "\t" + 1);
	        } else {
	            System.out.println(1);
	            System.out.println(1 + "\t" + 1);
	            for (int i = 1; i < line-1; i++) {
	                for (int j = i; j >= 1; j--) {
	                    a[j] = a[j] + a[j - 1];
	                }
	                for(int k =0;k<i+2;k++){
	                    System.out.print(a[k]+"\t");
	                }
	                System.out.println();
	            }
	        }*/
		int i,j;
		int[][] a = new int[8][8];
		for(i=0;i<8;i++){
			a[i][i] = 1;
			a[i][0] = 1;
		}
		for(i=2;i<8;i++){
			for(j=1;j<=i;j++){
				a[i][j] = a[i-1][j-1] + a[i-1][j];
			}
		}
		
		for(i=0;i<8;i++){
			for(j=0;j<=i;j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}

}
