package nl.mumasoft.jadvanced.patterns.iterable;

import java.util.Iterator;

public class SquareIteratorApplication
{
	public static void main(String[] args)
	{
		Iterator<Integer> squareIterable = new SquareIterator(1, 5);

		while (squareIterable.hasNext())
		{
			System.out.println(squareIterable.next());
		}
	}
}
