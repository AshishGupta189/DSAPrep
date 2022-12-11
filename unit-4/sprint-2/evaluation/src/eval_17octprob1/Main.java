package eval_17octprob1;

public class Main {
	/*
	 * Q1/- Explain the meaning of the deadlock in multithreaded application, when
	 * it can occur in multithreading applications.Write one example of deadlock.
	 * 
	 * => Deadlock is a condition in which we stuck and never completes the execution.
	 * example: if two threads are waiting for each other to execute for infinite time
	 * then this situation is known as Deadlock.
	 * 
	 * It can occur only because of synchronized keyword as if two threads which have locks of each other
	 * are waiting for each other to execute then it's a deadlock situation.
	 * 
	 */
	
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		
		ThreadA t1=new ThreadA(a1,b1);
		ThreadB t2=new ThreadB(a1,b1);
		
		t1.start();
		t2.start();
		
		//here the method is in deadlock situation
	}
	
	
}
