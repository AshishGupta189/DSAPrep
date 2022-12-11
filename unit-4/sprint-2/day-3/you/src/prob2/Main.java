package prob2;

public class Main {
	/*
	 * Q3/- Create two threads, one thread to display all even numbers between 1 &
	 * 20, another to display odd numbers between 1 & 20. Note: Display all even
	 * numbers followed by odd numbers from the main method. Hint: use join
	 */
	
	public static void main(String[] args) throws InterruptedException {
		ThreadA t1=new ThreadA();
		Thread2 t2=new Thread2();
		
		Thread a=new Thread(t1);
		Thread b=new Thread(t2);
		a.start();
		a.join();
		b.start();
	}

}
