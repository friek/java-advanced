package nl.mumasoft.jadvanced.builder;

public class Car
{
	private final String engine;
	private final String transmission;
	private final int seats;
	private final String color;
	private final boolean hasGPS;
	private final boolean hasSunroof;

	Car(CarBuilder builder)
	{
		this.engine = builder.engine;
		this.transmission = builder.transmission;
		this.seats = builder.seats;
		this.color = builder.color;
		this.hasGPS = builder.hasGPS;
		this.hasSunroof = builder.hasSunroof;
	}

	public String getEngine()
	{
		return engine;
	}

	public String getTransmission()
	{
		return transmission;
	}

	public int getSeats()
	{
		return seats;
	}

	public String getColor()
	{
		return color;
	}

	public boolean isHasGPS()
	{
		return hasGPS;
	}

	public boolean isHasSunroof()
	{
		return hasSunroof;
	}
}
