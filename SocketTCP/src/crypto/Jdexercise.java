package crypto;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.plaf.metal.OceanTheme;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Jdexercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		String in = sc.nextLine();
		String[] s = in.split(" ");
		double n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
	    add(n, m);
		}
		
		}
	public static void add(double n,int m){
		double sum=n;
		for(int i=1;i<m;i++){
			sum += Math.sqrt(n);
			n = Math.sqrt(n);
		}
		DecimalFormat df = new DecimalFormat("##.00");
		String sum1 = df.format(sum);
		System.out.println(sum1);
	}

	}


