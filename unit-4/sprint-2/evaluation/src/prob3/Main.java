package prob3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	/*
	 * //Q3/- Create a ThreadPool of 3 threads, submit the 6 tasks using Callable,
	 * and from each task calculate the product of supplied number from 1 and return
	 * the product from each thread. And then print the result. Note: Supply the
	 * number to the Callable task through the constructor of the Callable task
	 * class. Example if we supply 5 then the product should be (1*2*3*4*5 =120 )
	 */
	public static void main(String[] args) throws Exception{
		ExecutorService service=Executors.newFixedThreadPool(3);
		Mycallable[] arr= {
				new Mycallable(5),
				new Mycallable(7),
				new Mycallable(10),
				new Mycallable(6),
				new Mycallable(18),
				new Mycallable(22),
		};
		
		for(Mycallable s:arr) {
			Future f=service.submit(s);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}
