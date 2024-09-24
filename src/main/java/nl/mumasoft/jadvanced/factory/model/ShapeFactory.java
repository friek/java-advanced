package nl.mumasoft.jadvanced.factory.model;

public class ShapeFactory
{
	private ShapeFactory()
	{
	}

	public static Shape createCircle(double radius)
	{
		return new Circle(radius);
	}

	public static Shape createSquare(double angle)
	{
		return new Square(angle);
	}

	public static Shape createTriangle(double base, double height)
	{
		return new Triangle(base, height);
	}

	public static Shape createRectangle(double width, double height)
	{
		return new Rectangle(width, height);
	}
}
