package prob4;

public class ThreadC extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		int a=1;
		for(int i=1;i<=10;i++) {
			a*=i;
		}
		System.out.println(a);
		
	}
}
