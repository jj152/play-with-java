package concurrencyExamples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TimedExecutionExample01 {
	private ExecutorService executorService = Executors.newCachedThreadPool();

	public void timedRun(Runnable runnable, long timeout, TimeUnit unit)
			throws InterruptedException, ExecutionException {
		Future<?> task = executorService.submit(runnable);
		try {
			task.get(timeout, unit);
		} catch (TimeoutException e) {
			System.err.println("Timeout occurred." + e);
		} finally {
			task.cancel(true);
		}
	}

	public void stop() {
		executorService.shutdown();
	}

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		TimedExecutionExample01 timedExecution = new TimedExecutionExample01();
		timedExecution.timedRun(new Runnable() {
			@Override
			public void run() {
				while (!Thread.interrupted()) {
					System.out.println("Test me..");
				}
			}
		}, 100, TimeUnit.MICROSECONDS);
		System.out.println(Thread.interrupted());
		timedExecution.stop();
	}
}
