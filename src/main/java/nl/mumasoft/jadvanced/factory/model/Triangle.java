package nl.mumasoft.jadvanced.factory.model;

public class Triangle extends Shape
{
	private double base;
	private double height;

	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	@Override
	public double area()
	{
		return 0.5 * base * height;
	}
}
