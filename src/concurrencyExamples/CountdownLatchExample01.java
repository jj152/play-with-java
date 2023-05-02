/*Java Program to demonstrate usage of CountDownLatch.
A synchronization aid that allows one or more threads to wait until a set of operations being performed in other threads completes.
A CountDownLatch is initialized with a given count. The await methods block until the current count reaches zero due to invocations 
of the countDown() method, after which all waiting threads are released and any subsequent invocations of await return immediately. 
This is a one-shot phenomenon -- the count cannot be reset. If you need a version that resets the count, consider using a 
CyclicBarrier.*/
/*A CountDownLatch is a versatile synchronization tool and can be used for a number of purposes. A CountDownLatch initialized with a 
count of one serves as a simple on/off latch, or gate: all threads invoking await wait at the gate until it is opened by a thread 
invoking countDown(). A CountDownLatch initialized to N can be used to make one thread wait until N threads have completed some 
action, or some action has been completed N times.*/
/*A useful property of a CountDownLatch is that it doesn't require that threads calling countDown wait for the count to reach 
zero before proceeding, it simply prevents any thread from proceeding past an await until all threads could pass.*/

package concurrencyExamples;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchExample01 {
	public static void main(String args[]) throws InterruptedException {
		// Let us create task that is going to wait for four threads before it starts
		CountDownLatch latch = new CountDownLatch(4);
		// Let us create four worker threads and start them.
		Worker first = new Worker(1000, latch, "WORKER-1");
		first.start();
		Worker second = new Worker(2000, latch, "WORKER-2");
		second.start();
		Worker third = new Worker(3000, latch, "WORKER-3");
		third.start();
		Worker fourth = new Worker(4000, latch, "WORKER-4");
		fourth.start();
		// The main task waits for four threads to complete
		latch.await();
		// Main thread has started
		System.out.println(Thread.currentThread().getName() + " has finished");
	}
}

//A class to represent threads for which the main thread waits.
class Worker extends Thread {
	private int delay;
	private CountDownLatch latch;
	public Worker(int delay, CountDownLatch latch, String name) {
		super(name);
		this.delay = delay;
		this.latch = latch;
	}
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " started");
			System.out.println(Thread.currentThread().getName() + " finished");
			Thread.sleep(delay);
			latch.countDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
