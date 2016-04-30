package crypto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//获取第一行输入 n,v
		String vn = sc.nextLine();
		String[] svn = vn.split(" ");
		int n = Integer.parseInt(svn[0]);
		int v = Integer.parseInt(svn[1]);
		//获取之后每行数据
		int maxcount=1;
		int count=1;
		//计算第一组输入的魔幻因子含量
		String info = sc.nextLine();
		String[] sinfo = info.split(" ");
		int type = Integer.parseInt(sinfo[0]);
		int num = Integer.parseInt(sinfo[1]);
		int max=calculate(n, v, type, num);
		System.out.println(max);
		while(sc.hasNextLine()){      //for(int i=0;i<2;i++)
			String infon = sc.nextLine();
			count++;
			String[] sinfon = infon.split(" ");
			int typen = Integer.parseInt(sinfon[0]);
			int numn = Integer.parseInt(sinfon[1]);
			int maxn=calculate(n, v, typen, numn);
			System.out.println(maxn); //每组魔幻因子最高含量
			if(maxn > max){
				max = maxn;
				maxcount = count;
			}
		}
		System.out.println(max);
		System.out.println(maxcount);

	}
	//计算每组输入的魔幻因子含量
	public static int calculate(int n, int v, int type, int num){
		int sum=0;
		if(type == 1){
			if(n>v){
				sum = num*v;
			}else{
				sum = num*n;
			}
		}else if(type == 2){
			if(n>(v/2)){
				sum = num*v/2;
			}else{
				sum = num*n;
			}
		}
		return sum;
	}

}
