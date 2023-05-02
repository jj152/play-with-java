package concurrencyExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor1 implements Runnable{
	private int id;
	Processor1(int id){
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("starting: " + id);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		System.out.println("ending: " + id);
	}	
}
public class ThreadPoolExample01 {
	public static void main(String[] args) {
		/*
		 * thread pool of 3 threads. 3 threads start working on 3 different tasks at a time. Once the task of any
		 * thread is completed then that thread starts the next available task.
		 */
		ExecutorService exts = Executors.newFixedThreadPool(3); 
		for(int i = 0; i<7;i++) {
			exts.execute(new Processor1(i));
		}
		System.out.println("All tasks submitted...");
		exts.shutdown();
		try {
			exts.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		System.out.println("All tasks completed...");
	}
}
/* o/p ->
 * starting: 1 
 * All tasks submitted... 
 * starting: 2 
 * starting: 0 
 * ending: 0
 * starting: 3 
 * ending: 1 
 * starting: 4 
 * ending: 2 
 * starting: 5 
 * ending: 3 
 * starting: 6
 * ending: 4 
 * ending: 5 
 * ending: 6 
 * All tasks completed...
 */
