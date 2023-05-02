package lambdaExamples;

public class InnerClassWithLambdaExp2 {
	
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
		Thread t = new Thread(()->{
									for(int i = 0; i< 102;i++) {
										System.out.println("C1 thread");
									}
							});
		t.start();
		for(int i = 0; i< 1030;i++) {
			System.out.println("M1 thread");
		}
	}

}
