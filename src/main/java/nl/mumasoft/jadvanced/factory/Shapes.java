package nl.mumasoft.jadvanced.factory;

import nl.mumasoft.jadvanced.factory.model.Shape;
import nl.mumasoft.jadvanced.factory.model.ShapeFactory;

import java.util.List;
import java.util.stream.Stream;

public class Shapes
{
	public static void main(String[] args)
	{
		double totalArea = Stream.of(
						ShapeFactory.createCircle(5),
						ShapeFactory.createSquare(5),
						ShapeFactory.createTriangle(4, 5),
						ShapeFactory.createRectangle(4, 7)
				)
				.mapToDouble(Shape::area)
				.sum();

		System.out.println("Total area: " + totalArea);
	}
}
