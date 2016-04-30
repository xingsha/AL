package counterTest;

import java.util.concurrent.CyclicBarrier;

public class BarrierDemo {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		CyclicBarrier barrier = new CyclicBarrier(4,new TotalThread(counter));
		
		new Thread(new CityThread(counter, "四川", barrier)).start();
		new Thread(new CityThread(counter, "云南", barrier)).start();
		new Thread(new CityThread(counter, "江苏", barrier)).start();
		new Thread(new CityThread(counter, "陕西", barrier)).start();
	}

}
