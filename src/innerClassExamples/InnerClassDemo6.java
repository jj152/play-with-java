/* Anonymous Inner class extends a class */
package innerClassExamples;

//class MyThread extends Thread{ //without inner class
//	@Override
//	public void run() {
//		for(int i = 0; i< 1560;i++) {
//			System.out.println("C thread");
//		}
//		
//	}
//	
//}

public class InnerClassDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(){
			public void run() {
				for(int i = 0; i< 1560;i++) {
					System.out.println("C thread");
				}	
			}
		};
//		MyThread t = new MyThread(); //without inner class
		t.start();
		for(int i = 0; i< 1000;i++) {
			System.out.println("M thread");
		}
	}

}
