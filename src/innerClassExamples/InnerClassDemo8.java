package innerClassExamples;

/* Anonymous Inner class defined inside arguments */
public class InnerClassDemo8 {

	public static void main(String[] args) {
//		Thread t = new Thread(new Runnable(){			
//			@Override
//			public void run() {
//				for(int i = 0; i< 6;i++) {
//					System.out.println("C thread");
//				}
//			};
//		});
//		t.start();
		new Thread(new Runnable(){			
			@Override
			public void run() {
				for(int i = 0; i< 6;i++) {
					System.out.println("C thread");
				}
			};
		}).start();
		for(int i = 0; i< 100;i++) {
			System.out.println("M thread");
		}
	}

}
