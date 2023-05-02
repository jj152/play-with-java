package concurrencyExamples;

public class SynchronizedKeywordExample01 {
	private int count = 0;
	
	public synchronized void incrementCount() {
		count++;
	}

	public static void main(String[] args) {
		SynchronizedKeywordExample01 sck1 = new SynchronizedKeywordExample01();
		sck1.doWork();
	}
	public void doWork() {
		Thread t1 = new Thread(new Runnable() { //using anonymous class
			@Override
			public void run() {
				for(int i = 0; i<1000; i++) {
					incrementCount();
				}
			}
		});
		Runnable r2 = ()->{ 
				for(int i = 0; i<1000; i++) {
					incrementCount();
				}
		};
		Thread t2 = new Thread(r2); // using lambda exp.
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the count - "+ count);
	}
}
