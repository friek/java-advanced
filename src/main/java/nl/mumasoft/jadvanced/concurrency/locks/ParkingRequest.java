package nl.mumasoft.jadvanced.concurrency.locks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ParkingRequest implements Iterable<Car>
{
	private List<Car> cars = new ArrayList<>();

	public ParkingRequest(Car car, Car... cars)
	{
		this.cars.add(car);
		this.cars.addAll(Arrays.asList(cars));
	}

	@Override
	public Iterator<Car> iterator()
	{
		return this.cars.iterator();
	}
}
