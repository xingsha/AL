package DevelopModal;

public class Singleton {
	public static void main(String[] args) {
		
	
	A a = A.getA();
	A b = A.getA();
	if(a==b){
		System.out.println("Singleton========>A");
	}else{
		System.out.println("error");
	}
	B b1 = B.getB();
	B b2 = B.getB();
	System.out.println(b1==b2);
	
	}
}


class A{
	private static A instance;
	private A(){}
	public static synchronized A getA(){
		if(instance==null){
			instance = new A();
		}
	return instance;
	}
}

class B{
	private static B instence = new B();
	private B() {}
	
	public static B getB(){
		return instence;
	}
	
}
