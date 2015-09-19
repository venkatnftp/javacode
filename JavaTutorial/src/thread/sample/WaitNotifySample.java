package thread.sample;

public class WaitNotifySample {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();

		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

		System.out.println("Total is: " + b.total);
	}

	static class ThreadB extends Thread {
		int total;

		@Override
		public void run() {
			synchronized (this) {
				System.out.println("Started the job..");
				for (int i = 0; i < 100; i++) {
					total += i;
				}
				System.out.println("Finished the job notifying other threads..");
				notify();
			}
		}
	}
}
