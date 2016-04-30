package counterTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CityThread implements Runnable{
	
	private Counter counter;
	private String city;
	private CyclicBarrier barrier;
	
	

	public CityThread(Counter counter, String city, CyclicBarrier barrier) {
		
		this.counter = counter;
		this.city = city;
		this.barrier = barrier;
	}



	@Override
	public void run() {
		
		this.counter.cityCount(city);
		try {
			//×èÈûµÈ´ý
			this.barrier.await();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
