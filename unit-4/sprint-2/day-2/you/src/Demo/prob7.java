package Demo;

public class prob7 {
	/*
	 * Q7) Create an application in which start 2 threads along with main thread : ●
	 * Both threads will print their priority along with the thread name 10 times. ●
	 * From the main method set the name of both the thread as Dhoni thread for
	 * thread 1 And Kohli thread for thread 2, ● Set the priority for thread1 as 8
	 * and thread2 as 10. Note: Both threads should run on a single object.
	 */
	public static void main(String[] args) {
		ThreadA t1=new ThreadA();
		
		
		Thread t2=new Thread(t1);
		
		Thread t3=new Thread(t1);
		
		t2.setName("Dhoni thread");
		t2.setPriority(8);
		t3.setName("Kohli thread");
		t3.setPriority(10);
		t2.start();
		t3.start();
	}
	
}
