package consAndMethodRefExamples;

public class MethodRefExample {
	
	public void myRun() {
		for (int i = 0; i < 30; i++) 
		{
			System.out.println(Thread.currentThread().getName()+" Child thread1");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		// Thread by Runnable - b4 java 7
		new Thread(new RunnableImpl()).start();

		// Thread by lambda
		new Thread(
			() -> {
				for (int i = 0; i < 40; i++) 
				{
					System.out.println(Thread.currentThread().getName()+" Child thread2");
				}
			}
		).start();
		
		// Thread by method ref
		new Thread(
			new MethodRefExample()::myRun
		).start();
		
		
		for (int i = 0; i < 10; i++) {
			//Thread.sleep(10);
			System.out.println(Thread.currentThread().getName()+" Main thread");
		}

	}

}

class RunnableImpl implements Runnable {		 
    public void run()
    {
    	for (int i = 0; i < 70; i++) 
		{
			System.out.println(Thread.currentThread().getName()+" Child thread");
		}
    }
}
