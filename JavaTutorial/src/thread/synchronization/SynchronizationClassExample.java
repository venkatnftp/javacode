package thread.synchronization;

import thread.sample.Singleton;

public class SynchronizationClassExample extends Thread {
	int threadId;
	public SynchronizationClassExample(int i) {
		this.threadId = i;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new SynchronizationClassExample(i).start();
		}
	}

	@Override
	public void run() {
		Thread.currentThread().setName(String.valueOf(this.threadId));
		System.out.println("Getting singleton for "+Thread.currentThread().getName());
		Singleton singleton = Singleton.getInstance();
	}

}
