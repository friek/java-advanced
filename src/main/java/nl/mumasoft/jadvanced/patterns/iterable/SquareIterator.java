package nl.mumasoft.jadvanced.patterns.iterable;

import java.util.Iterator;

public class SquareIterator implements Iterator<Integer>
{
	private int current;
	private final int max;

	public SquareIterator(int min, int max)
	{
		this.current = min;
		this.max = max;
	}

	@Override
	public boolean hasNext()
	{
		return current <= max;
	}

	@Override
	public Integer next()
	{
		return current * current++;
	}
}
