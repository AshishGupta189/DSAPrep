package prob2;

public class Main {
	/*
	 * //Q2/- Make a thread that will calculate the product of 1 to 10 number and
	 * another thread (main thread ) will print the calculated value of the first
	 * thread. Make use of wait and notify method.
	 */
	
	public static void main(String[] args) throws InterruptedException {
		ThreadA t1=new ThreadA();
		t1.start();
		synchronized (t1) {
			System.out.println("waiting state");
			t1.wait();
			System.out.println("Notified");
			System.out.println(t1.pro);
		}
		
	}

}
