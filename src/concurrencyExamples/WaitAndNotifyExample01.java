package concurrencyExamples;

import java.util.Scanner;

public class WaitAndNotifyExample01 {
	public static void main(String[] args) throws InterruptedException {
        final Processor processor = new Processor();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (InterruptedException ignored) {}
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consume();
                } catch (InterruptedException ignored) {}
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

class Processor {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread running ....");
            wait();
            System.out.println("Resumed.");
        }
    }
    public void consume() throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
			Thread.sleep(2000);
			synchronized (this) {
			    System.out.println("Waiting for return key.");
			    scanner.nextLine();
			    System.out.println("Return key pressed.");
			    notify(); // notify() does not hand over the control of the lock. So here produce() will get the control once the sleep(5000) is finished
			    Thread.sleep(5000);
			    System.out.println("Consumption done.");
			}
		}
    }
}
