package prob4;

public class ThreadB extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
}
