package zhengze;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		String rs = null;
		for(long i=0;i<n;i++){
			String line1 = sc.nextLine();
			String line2 = sc.nextLine();
			String line3 = sc.nextLine();
			String[] d1 = line1.split(" ");
			String[] d2 = line2.split(" ");
			String[] d3 = line3.split(" ");
			//x轴坐标
			Double[] x = new Double[3];
			x[0] = Double.parseDouble(d1[0]);
			x[1] = Double.parseDouble(d2[0]);
			x[2] = Double.parseDouble(d3[0]);
			Double a = max(x[0], x[1], x[2]);
			//y轴坐标
			Double[] y = new Double[3];
			y[0] = Double.parseDouble(d1[1]);
			y[1] = Double.parseDouble(d2[1]);
			y[2] = Double.parseDouble(d3[1]);
			Double b = max(y[0], y[1], y[2]);
			Double square = a*b;
			DecimalFormat df = new DecimalFormat("0.000000");
			String sq = df.format(square);
			rs = sq;
			System.out.println();
			System.out.println(sq);
		}
		//System.out.println(rs);
		/*Scanner sc = new Scanner(System.in);
		String mn = sc.nextLine();
		String t = sc.nextLine();
		String[] nm = mn.split(" ");
		String[] tx = t.split(" ");
		long n = Integer.parseInt(nm[0]); //小明家楼层
		long m = Integer.parseInt(nm[1]); //电梯所在楼层
		long t1 = Integer.parseInt(tx[0]);//t1表示电梯每经过一层楼的时间
		long t2 = Integer.parseInt(tx[1]);//t2表示开门时间
		long t3 = Integer.parseInt(tx[2]);//t3表示关门时间
		long t4 = Integer.parseInt(tx[3]);//t4表示小赛每下一层楼的时间
		
		long time0 = t4 * (n-1);              //小明走楼梯下楼的时间
		long time1 = Math.abs(m-n)*t1 + t2 + t3 + (n-1)*t1 + t2;
		if(time0>time1)
			System.out.println(time1);
		else
			System.out.println(time0);*/

	}
	public static Double max(Double a,Double b,Double c){
		Double e1 = Math.abs(a-b);
		Double e2 = Math.abs(a-c);
		Double e3 = Math.abs(b-c);
		Double max = e1;
		if(e2>max){
			max = e2;
		}
		if(e3>max){
			max = e3;
		}
		return max;
	}

}
