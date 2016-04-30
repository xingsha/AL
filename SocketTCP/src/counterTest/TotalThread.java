package counterTest;

public class TotalThread implements Runnable{
	
	private Counter counter;
	

	public TotalThread(Counter counter) {
		
		this.counter = counter;
	}


	@Override
	public void run() {
		
		this.counter.totalCount();
	}

}
