package prob2;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			if(i%2!=0) {
				System.out.println("Odd number"+i);
			}
		}
	}

}
