package lambdaExamples;

public class InnerClassWithLambdaExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Without lambda exp
//		Runnable r = new Runnable(){			
//			@Override
//			public void run() {
//					for(int i = 0; i< 10;i++) {
//						System.out.println("C thread");
//					}
//			};
//		};
		// With lambda exp
		Runnable r =()->{
							for(int i = 0; i< 10;i++) {
						System.out.println("C thread");
						}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i< 1030;i++) {
			System.out.println("M thread");
		}
	}

}
