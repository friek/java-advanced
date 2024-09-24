package nl.mumasoft.jadvanced.factory;

import nl.mumasoft.jadvanced.factory.model.Shape;
import nl.mumasoft.jadvanced.factory.model.ShapeFactory;

import java.util.List;

public class Shapes
{
	public static void main(String[] args)
	{
		List<Shape> shapes = List.of(
				ShapeFactory.createCircle(5),
				ShapeFactory.createSquare(5),
				ShapeFactory.createTriangle(4, 5)
		);

		double totalArea = shapes.stream().mapToDouble(Shape::area).sum();
		System.out.println("Total area: " + totalArea);
	}
}
