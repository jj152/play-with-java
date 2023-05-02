package concurrencyExamples;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample01 {
	
	private static BlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args){
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}
	private static void producer() throws InterruptedException {
		Random r = new Random();
		int i = 0;
		while(true) {
			q.put(r.nextInt(100));
			i++;
		}		
	}
	private static void consumer() throws InterruptedException {
		Random r = new Random();
		while(true) {
			Thread.sleep(900);
			//if(r.nextInt(10) == 0){	
				Integer v = q.take();
				System.out.println("item taken: "+ v + " q size: "+ q.size());				
			//}
		}			
	}
}
