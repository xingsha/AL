package Algorithms;

import java.util.LinkedList;
import java.util.List;
//50个人围成一圈，每到3和3的倍数出圈，最后剩下的人原来是几号，原来位置是？
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
