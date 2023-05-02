package concurrencyExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLockExample01 {	
	private List<Integer> l1 = new ArrayList<Integer>();
	private List<Integer> l2 = new ArrayList<Integer>();
	private Random random = new Random();
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	public  void stageOne(){
		synchronized(lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l1.add(random.nextInt());
		}		
	}
	public void stageTwo(){
		synchronized(lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l2.add(random.nextInt());
		}		
	}
	public void process() {
		for(int i = 0; i<1000; i++) {
			stageOne();
			stageTwo();
		}
	}
	public static void main(String[] args) {
		MultipleLockExample01 m = new MultipleLockExample01();
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				m.process();				
			}			
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				m.process();				
			}			
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("diff - "+ (start-end));
		System.out.println("l1 size - "+m.l1.size() + " and l2 size - "+m.l2.size());
	}
}
