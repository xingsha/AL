package file;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
		String snum = sc.nextLine();
		String[] str = snum.split(" ");
		int[] num = new int[str.length];
		try {
			for(int i=0;i<str.length;i++){
				num[i] = Integer.parseInt(str[i]);
			}
			
			int[] count = new int[num.length];
			for(int i=0;i<num.length;i++){
				int temp = num[i];
				count[i] = 1;
				for(int j=i+1;j<num.length;j++){
					if(num[j]>temp){
						count[i]++;
						temp = num[j];
					}
				}
			}
			int max = count[0];
			int m = 0;
			for(int i=0;i<count.length;i++){
				if(count[i]>max){
					max = count[i];
					m = i;
				}
			}
			System.out.println("count[]:"+Arrays.toString(count));
			StringBuffer bf = new StringBuffer();
			bf.append(num[m]+" ");
			int temp = num[m];
			for(int i=m;i<num.length;i++){
				if(num[i]>temp){
					temp = num[i];
					bf.append(temp+" ");
				}
			}
			//System.out.println(Arrays.toString(num));
			bf.replace(bf.length()-1, bf.length(), "");
			String rs = bf.toString();
			System.out.println(rs);
		} catch (Exception e) {
			System.out.println("error");
			
		}
		}

	}

}
