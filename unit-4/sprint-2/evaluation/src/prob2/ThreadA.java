package prob2;

public class ThreadA extends Thread{
	int pro=1;
@Override
public void run() {
	synchronized (this) {
		System.out.println("product of numbers from 1 to 10 is :");
		for(int i=1;i<=10;i++) {
			pro*=i;
		}
		this.notify();
	}
}
}
