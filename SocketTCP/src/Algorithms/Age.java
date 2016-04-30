package Algorithms;

public class Age {

	public static void main(String[] args) {
		
		System.out.println(age1(5));

	}
	
	public static int age1(int a){
		
		if(a==1){
			return 10;
		}
		
		return 2+age1(a-1);
	}

}
