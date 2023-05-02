package concurrencyExamples;

public class ThreadInterruptionExample01 {

	public static void main(String[] args) throws InterruptedException {
		Thread taskThread = new Thread(new MyRunnable());
		taskThread.start();
		Thread.sleep(3000);
		taskThread.interrupt();
		// Thread.sleep(5000);
		System.out.println("2 - " + taskThread.isInterrupted());
	}

}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("1 - " + Thread.currentThread().isInterrupted());
				break;
			}

			/*
			 * if(Thread.interrupted()) { break; }
			 */
		}
	}
}
