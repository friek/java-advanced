package nl.mumasoft.jadvanced.concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class CyclicBarrierTest
{
	public static void main(String[] args)
	{
		int maxThreads = 3;
		var cb = new CyclicBarrier(maxThreads, () -> System.out.println("All threads finished"));
		try (var executor = Executors.newFixedThreadPool(maxThreads))
		{
			executor.submit(() -> new Task("A", cb).run());
			executor.submit(() -> new Task("B", cb).run());
			executor.submit(() -> new Task("C", cb).run());
		}
	}

	private record Task(String me, CyclicBarrier cb) implements Runnable
	{
		@Override
		public void run()
		{
			System.out.println("Thread " + me + " started");
			try
			{
				cb.await();
			}
			catch (Exception e)
			{
				throw new RuntimeException(e);
			}
		}
	}
}
