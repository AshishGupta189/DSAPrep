package prob4;

public class Main {
	/*
	 * //Q4/- Write a multithreading application which should perform the following
	 * task: ● Start the 3 thread ● Give the name of those threads as Kohli, Dhoni,
	 * Rohit ● Set the max priority to the Dhoni thread. ● Kohli thread should print
	 * from 1 to 10 number ● Dhoni thread should print Addition of first 20 number.
	 * ● Rohit Thread should print the product of first 10 number. Note: Make sure
	 * that first Dhoni thread should print then Rohit Thread and then Kohli Thread.
	 */
	
	public static void main(String[] args) throws Exception {
		ThreadA t1=new ThreadA();
		ThreadB t2=new ThreadB();
		ThreadC t3=new ThreadC();
		
		t2.setName("Kohli");
		t1.setName("Dhoni");
		t3.setName("Rohit");
		t1.setPriority(10);

		t1.start();
		t1.join();
		t3.start();
		t3.join();
		t2.start();
	}
}
