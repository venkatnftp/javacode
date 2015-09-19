package thread.synchronization;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationBlockExample extends Thread{
	private List<String> names = new ArrayList<String>();
	int threadId;
	public SynchronizationBlockExample(int i) {
		this.threadId = i;
	}

	private void addName(String input){
		//get lock on the names
		System.out.println("**** Thread "+Thread.currentThread().getName()+" will try to acquire lock");
		synchronized (this.names) {
			System.out.println("**** Thread "+Thread.currentThread().getName()+" acquired lock");
			names.add(input);
			System.out.println("**** Thread "+Thread.currentThread().getName()+" release lock");
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			SynchronizationBlockExample sample = new SynchronizationBlockExample(i);
			sample.start();
		}
	}

	@Override
	public void run() {
		Thread.currentThread().setName(String.valueOf(this.threadId));
		System.out.println("Thread "+Thread.currentThread().getName()+" adding data");
		addName(String.valueOf(System.currentTimeMillis()));
	}
	
	
}
