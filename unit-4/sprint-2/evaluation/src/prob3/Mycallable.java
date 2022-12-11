package prob3;

import java.util.concurrent.Callable;

public class Mycallable implements Callable{
	int num;
	public Mycallable(int num) {
		this.num = num;
	}
	@Override
	public Object call() throws Exception {
		long pro=1;
		for(int i=1;i<=num;i++) {
			pro*=i;
		}
		return pro;
	}
	
}
