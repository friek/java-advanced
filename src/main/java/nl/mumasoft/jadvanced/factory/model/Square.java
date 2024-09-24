package nl.mumasoft.jadvanced.factory.model;

public class Square extends Shape
{
	private double angle;

	Square(double angle)
	{
		this.angle = angle;
	}

	@Override
	public double area()
	{
		return angle * angle;
	}
}
