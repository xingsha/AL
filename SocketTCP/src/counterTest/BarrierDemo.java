package counterTest;

import java.util.concurrent.CyclicBarrier;

public class BarrierDemo {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		CyclicBarrier barrier = new CyclicBarrier(4,new TotalThread(counter));
		
		new Thread(new CityThread(counter, "�Ĵ�", barrier)).start();
		new Thread(new CityThread(counter, "����", barrier)).start();
		new Thread(new CityThread(counter, "����", barrier)).start();
		new Thread(new CityThread(counter, "����", barrier)).start();
	}

}
