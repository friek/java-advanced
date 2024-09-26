package nl.mumasoft.jadvanced.concurrency.locks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Garage implements Iterable<ParkingSpot>
{
	private long id = 0;
	private final List<ParkingSpot> parkingSpots = new ArrayList<>();
	private final ReentrantLock lock = new ReentrantLock();

	/*
	 * This method invokes the park(Car) method below for each car it contains
	 */
	public void park(ParkingRequest parkingRequest)
	{
		for (var car : parkingRequest)
		{
			park(car);
		}
	}

	public void park(Car car)
	{
		lock.lock();
		try
		{
			var parkingSpot = new ParkingSpot(++this.id, car);
			parkingSpots.add(parkingSpot);
		}
		finally
		{
			lock.unlock();
		}
	}

	@Override
	public Iterator<ParkingSpot> iterator()
	{
		return this.parkingSpots.iterator();
	}
}
