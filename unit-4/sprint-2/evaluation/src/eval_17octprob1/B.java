package eval_17octprob1;

public class B {
	public synchronized void Y(A a1) {
		System.out.println("Func. Y of B starts");
		a1.funA();
		System.out.println("Func. Y of B ends");
	}
	
	public synchronized void funB() {
		System.out.println("inside funB of B");
	}
}
