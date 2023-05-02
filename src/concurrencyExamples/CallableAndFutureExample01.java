package concurrencyExamples;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

public class CallableAndFutureExample01 {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Integer> future = ex.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duration = random.nextInt(4000);
				if (duration > 2000) {
					throw new TimeoutException("Sleeping for too long.");
				}
				System.out.println("Starting ...");
				try {
					Thread.sleep(duration);
				} catch (InterruptedException ignored) {
				}
				System.out.println("Finished.");
				return duration;
			}
		});
		ex.shutdown();
		try {
			// get returned value from call()
			System.out.println("Result is: " + future.get());

		} catch (InterruptedException ignored) {
		} catch (ExecutionException e) {
			TimeoutException excp = (TimeoutException) e.getCause();
			System.out.println(excp.getMessage());
		}
	}

}
