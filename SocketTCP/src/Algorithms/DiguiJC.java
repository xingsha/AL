package Algorithms;

public class DiguiJC {

	public static void main(String[] args) {
		
		int rs = JC(5);
		System.out.println(rs);

	}
	public static int JC(int a){
		
		if(a==1){
			return 1;
		}
		return a*JC(a-1);
	}

}
