package DevelopModal;

public class SimpleFactory {

	public static void main(String[] args) {
		Auto car = AutoFactory.creatAuto(1);
		Auto truck = AutoFactory.creatAuto(2);
		
		System.out.println(car.getClass().getName());
		System.out.println(truck.getClass().getName());
		

	}
}

abstract class Auto{
		
}
	
class Car extends Auto{
	
}
	
class Truck extends Auto{
	
}

class AutoFactory{
	
	public static Auto creatAuto(int autoType){
		if(autoType == 1){
			return new Car();
		}else if(autoType == 2){
			return new Truck();
		}
		
		return null;	
		
	}
	
}	


	




