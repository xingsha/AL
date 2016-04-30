package DevelopModal;

public class FactoryFunction {

	public static void main(String[] args) {
		
		AutoFactory1 car = new CarFactory1();
		AutoFactory1 truck = new TruckFactory1();
		System.out.println(car.creat());
		System.out.println(truck.creat());
		

	}
}

abstract class Auto1{}
class Car1 extends Auto{}
class Truck1 extends Auto{}




abstract class AutoFactory1{
	public abstract  Auto creat();
}

class CarFactory1 extends AutoFactory1{

	@Override
	public  Auto creat() {
		
		return new Car();
	}
	
}

class TruckFactory1 extends AutoFactory1{

	@Override
	public Auto creat() {
		
		return new Truck();
	}
	
}


