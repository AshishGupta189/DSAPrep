package prob2;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			
			if(i%2==0) {
				System.out.println("Even"+i);
			}
		}
	}

}
