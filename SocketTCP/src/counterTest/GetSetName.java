package counterTest;

public class GetSetName {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		new Thread(tt,"线程A").start();;
		new Thread(tt).start();;
		new Thread(tt,"线程B").start();;
		new Thread(tt).start();;
		new Thread(tt,"线程C").start();;
		tt.run();
	}
}

class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}