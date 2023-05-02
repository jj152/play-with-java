package innerClassExamples;
/* Anonymous Inner class implements an interface */

//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		for(int i = 0; i< 10;i++) {
//			System.out.println("C thread");
//		}
//	}
//}

public class InnerClassDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable(){			
			@Override
			public void run() {
					for(int i = 0; i< 10;i++) {
						System.out.println("C thread");
					}
			};
		};
//		MyRunnable r = new MyRunnable(); //without inner class
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i< 100;i++) {
			System.out.println("M thread");
		}
	}

}
