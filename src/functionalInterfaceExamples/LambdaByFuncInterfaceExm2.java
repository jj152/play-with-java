package functionalInterfaceExamples;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i< 10;i++) {
			System.out.println("C thread");
		}
		
	}
	
}

class MyNotRunnable{
	public void run() {
		for(int i = 0; i< 1560;i++) {
			System.out.println("C thread");
		}	
	}
}

public class LambdaByFuncInterfaceExm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyRunnable r = new MyRunnable();
//		Thread t = new Thread(r);
//		t.start();
//		MyNotRunnable r = new MyNotRunnable();
//		r.run();
		Runnable r = ()-> {
			for(int i = 0; i< 10;i++) {
				System.out.println("C thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i< 100;i++) {
			System.out.println("M thread");
		}

	}

}
