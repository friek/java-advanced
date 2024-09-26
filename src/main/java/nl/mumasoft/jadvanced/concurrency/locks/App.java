package nl.mumasoft.jadvanced.concurrency.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class App
{

	public static void main(String[] args) throws InterruptedException
	{
		final Garage garage = new Garage();

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 1; i < 6; i++)
		{
			int finalI = i;
			executorService.execute(() -> {
				Car first = new Car("%d-1".formatted(finalI));
				Car second = new Car("%d-2".formatted(finalI));

				if (finalI % 2 == 1)
				{
					garage.park(first);
				}
				else
				{
					var parkingRequest = new ParkingRequest(first, second);
					garage.park(parkingRequest);
				}
			});
		}
		executorService.shutdown();
		executorService.awaitTermination(10, TimeUnit.SECONDS);

		for (var spot : garage)
		{
			System.out.println(spot);
		}
	}
}
