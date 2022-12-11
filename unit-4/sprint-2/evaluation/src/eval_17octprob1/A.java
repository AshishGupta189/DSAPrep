package eval_17octprob1;

public class A {
	public synchronized void X(B b1) {
		System.out.println("Func. X of A starts");
		b1.funB();
		System.out.println("Func. X of A ends");
	}
	
	public synchronized void funA() {
		System.out.println("inside funA of A");
	}
	
}
