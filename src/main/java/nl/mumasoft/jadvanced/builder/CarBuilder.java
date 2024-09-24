package nl.mumasoft.jadvanced.builder;

public class CarBuilder
{
	String engine;
	String transmission;
	int seats;
	String color;
	boolean hasGPS;
	boolean hasSunroof;

	public Car build()
	{
		return new Car(this);
	}

	public CarBuilder engine(String engine)
	{
		this.engine = engine;
		return this;
	}

	public CarBuilder transmission(String transmission)
	{
		this.transmission = transmission;
		return this;
	}

	public CarBuilder seats(int seats)
	{
		this.seats = seats;
		return this;
	}

	public CarBuilder color(String color)
	{
		this.color = color;
		return this;
	}

	public CarBuilder hasGPS(boolean hasGPS)
	{
		this.hasGPS = hasGPS;
		return this;
	}

	public CarBuilder hasSunroof(boolean hasSunroof)
	{
		this.hasSunroof = hasSunroof;
		return this;
	}
}
