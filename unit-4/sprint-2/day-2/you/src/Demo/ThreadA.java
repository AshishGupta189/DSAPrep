package Demo;

public class ThreadA implements Runnable {

	public ThreadA() {
		super();
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread().getName());
		}
		
	}

}
