package Algorithms;

public class PeachAndMonkey {

	public static void main(String[] args) {
		int peach = 1;
		
		for(int i =10;i>0;i--){
			peach = 2*(peach + 1);
			
		}
		System.out.println("��һ����"+peach+"������");
		
		//����:
		int p = 1;
        for(int i =0; i<10;i++){
            p = (p+1)*2;
        }
        System.out.println(p);
	}

}
