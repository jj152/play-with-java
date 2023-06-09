package concurrencyExamples;
import java.util.LinkedList;
import java.util.Random;

public class MultipleLockExample02 {

	public static void main(String[] args) throws InterruptedException {
		final ProcessorMultipleLockExample02 processor = new ProcessorMultipleLockExample02();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					processor.produce();
				} catch (InterruptedException ignored) {
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					processor.consume();
				} catch (InterruptedException ignored) {
				}
			}
		});
		t1.start();
		t2.start();
		Thread.sleep(30000);
		System.exit(0);
	}

}

class ProcessorMultipleLockExample02 {
	private LinkedList<Integer> list = new LinkedList<>();
	private final int LIMIT = 10;
	private final Object lock = new Object();

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized(lock) {
				while (list.size() == 10) {
					lock.wait();
				}
				list.add(value);
				System.out.println("Producer added: " + value + " queue size is " + list.size());
				value++;
				lock.notify();
			}			
		}
	}

	public void consume() throws InterruptedException {
		Random random = new Random();
		while (true) {
			synchronized(lock) {
				while (list.size() == 0) {
					lock.wait();
				}
				int value = list.removeFirst();
				System.out.print("Removed value by consumer is: " + value);
				System.out.println(" Now list size is: " + list.size());
				lock.notify();				
			}
			Thread.sleep(random.nextInt(1000)); //force producer fill the queue to LIMIT_SIZE
		}
	}
}
