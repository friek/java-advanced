package nl.mumasoft.jadvanced.patterns.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fruitmand implements Iterable<Fruit>
{
	private List<Fruit> content = new ArrayList<>();

	public void add(Fruit fruit)
	{
		content.add(fruit);
	}

	@Override
	public Iterator<Fruit> iterator()
	{
		return content.iterator();
	}
}
