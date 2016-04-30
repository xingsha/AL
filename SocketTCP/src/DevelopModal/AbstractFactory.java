package DevelopModal;

public class AbstractFactory {

	public static void main(String[] args) {
		
		AutoFactory2 car = new CarFactory();
		AutoFactory2 truck = new TruckFactory();
		
		System.out.println(car.creat()+"=="+car.creatWheel());
		System.out.println(truck.creat()+"=="+truck.creatWheel());
		
	}

}


abstract class Auto2{}
class Car2 extends Auto2{}
class Truck2 extends Auto2{}

abstract class wheel{}
class CarWheel extends wheel{}
class TruckWheel extends wheel{}

interface Wheel1{
	public abstract wheel creatWheel();
}

abstract class AutoFactory2 implements Wheel1{

	public abstract Auto2 creat();
	public abstract wheel creatWheel();
}

class CarFactory extends AutoFactory2{

	@Override
	public Auto2 creat() {
		
		return new Car2();
	}

	@Override
	public wheel creatWheel() {
		// TODO Auto-generated method stub
		return new CarWheel(); 
	}
	
}

class TruckFactory extends AutoFactory2{

	@Override
	public Auto2 creat() {
		
		return new Truck2();
	}

	@Override
	public wheel creatWheel() {
		
		return new TruckWheel();
	}
	
}

