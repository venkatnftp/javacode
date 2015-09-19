package thread.sample;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {
	@Override
	public Long call() throws Exception {
		long sum = 0;
		for (long i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Computed Sum: "+sum);
		return sum;
	}

}