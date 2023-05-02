package concurrencyExamples;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocksExample01 {
	public static void main(String[] args) throws Exception {
        final RunnerReentrantLocksExample01 runner = new RunnerReentrantLocksExample01();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    runner.firstThread();
                } catch (InterruptedException ignored) {
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    runner.secondThread();
                } catch (InterruptedException ignored) {
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        runner.finished();
    }
}

class RunnerReentrantLocksExample01 {    
	private int count = 0;
	private Lock lock = new ReentrantLock();
    private Condition cond = lock.newCondition();
    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }
    public void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("Waiting ....");
        cond.await();
        Thread.sleep(1000);
        System.out.println("Woken up!");
        Thread.sleep(1000);
        try {
            increment();
        } finally {
       	 	System.out.println("counting...");
        	Thread.sleep(2000);
            lock.unlock();
        }
    }
    @SuppressWarnings("resource")
	public void secondThread() throws InterruptedException {
        Thread.sleep(2000);
        lock.lock();
        System.out.println("Press the return key!");
        new Scanner(System.in).nextLine();
        System.out.println("Got return key!");
        cond.signal();
        Thread.sleep(2000);
        System.out.println("but signal doesn't mean lock is surrendered");
        Thread.sleep(2000);
        try {
            increment();
        } finally {
            //should be written to unlock Thread whenever signal() is called
            lock.unlock();
            System.out.println("finally the lock is surrendered");
        }
    }
    public void finished() {
        System.out.println("Count is: " + count);
    }
}
