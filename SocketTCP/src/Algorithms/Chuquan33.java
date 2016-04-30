package Algorithms;

import java.util.LinkedList;
import java.util.List;
//50����Χ��һȦ��ÿ��3��3�ı�����Ȧ�����ʣ�µ���ԭ���Ǽ��ţ�ԭ��λ���ǣ�
public class Chuquan33 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i =0;i<50;i++)
			list.add(new Integer(i+1));
		int index = 0;
		while(list.size()>1){
			index = (index + 3) % list.size();
			list.remove(index--);
		}
			int survive = list.get(0).intValue();
			System.out.println(survive);
			

	}
	
	
}
