package concurrencyExamples;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableAndFutureExample02 {
	public static void main(String[] args) throws Exception {
		// FutureTask is a concrete class that
		// implements both Runnable and Future
		@SuppressWarnings("unchecked")
		FutureTask<Integer>[] randomNumberTasks = new FutureTask[5];
		for (int i = 0; i < 5; i++) {
			// Create the FutureTask with Callable
			randomNumberTasks[i] = new FutureTask<Integer>((Callable<Integer>) new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					Random generator = new Random();
					Integer randomNumber = generator.nextInt(5);
					Thread.sleep(randomNumber * 1000);
					return randomNumber;
				}
			});
			// As it implements Runnable, create Thread
			// with FutureTask
			Thread t = new Thread(randomNumberTasks[i]);
			t.start();
		}
		for (int i = 0; i < 5; i++) {
			// As it implements Future, we can call get()
			System.out.println(randomNumberTasks[i].get());

			// This method blocks till the result is obtained
			// The get method can throw checked exceptions
			// like when it is interrupted. This is the reason
			// for adding the throws clause to main
		}
	}
}
