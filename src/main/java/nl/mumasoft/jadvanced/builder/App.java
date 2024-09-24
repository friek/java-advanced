package nl.mumasoft.jadvanced.builder;

public class App
{
	public static void main(String[] args)
	{
		Car car = new CarBuilder()
				.engine("V8")
				.transmission("Automatic")
				.seats(4)
				.color("Red")
				.hasGPS(true)
				.hasSunroof(true)
				.build();

		System.out.println("Car engine: " + car.getEngine());
		System.out.println("Car transmission: " + car.getTransmission());
		System.out.println("Car seats: " + car.getSeats());
		System.out.println("Car color: " + car.getColor());
		System.out.println("Car has GPS: " + car.isHasGPS());
		System.out.println("Car has sunroof: " + car.isHasSunroof());
	}
}
