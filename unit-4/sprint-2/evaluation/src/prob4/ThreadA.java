package prob4;

public class ThreadA extends Thread {
@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	int a=0;
	for(int i=1;i<=20;i++) {
		a+=i;
	}
	System.out.println(a);
	
}
}
