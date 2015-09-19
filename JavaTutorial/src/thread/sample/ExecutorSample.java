package thread.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSample {
	private static final int NTHREDS = 2;

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new MyRunnable(10000000L + i);
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}

}
