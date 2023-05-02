package concurrencyExamples;

import java.util.Scanner;

public class VolatileExample01 {
	private volatile static boolean flag = true;

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (flag) {
					System.out.println("Hello world");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (flag == false) {
					System.out.println("stopping....");
				}
			}
		});
		t.start();
		System.out.println("press return to stop");
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextLine();
		}
		shutdown();
		Thread.sleep(1000);
		System.out.println("stopped");
	}

	private static void shutdown() {
		flag = false;

	}
	/*
	 * processor1 prc = new processor1(); prc.start();
	 * 
	 * System.out.println("press return to stop"); try (Scanner sc = new
	 * Scanner(System.in)) { sc.nextLine(); } prc.shutdown();
	 */
}

/*
 * class processor1 implements Runnable{
 * 
 * private volatile boolean flag = true;
 * 
 * @Override public void run() { while(flag) {
 * System.out.println("Hello world"); try { Thread.sleep(100); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } } if(flag==false) { System.out.println("stopping"); }
 * 
 * } public void shutdown() { flag = false; } }
 */
