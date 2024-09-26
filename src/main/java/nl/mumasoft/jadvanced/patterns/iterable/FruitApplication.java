package nl.mumasoft.jadvanced.patterns.iterable;

public class FruitApplication
{
	public static void main(String[] args)
	{
		Fruitmand m = new Fruitmand();

		m.add(new Fruit("Apple"));
		m.add(new Fruit("Pear"));
		m.add(new Fruit("Banana"));

		for (Fruit fruit : m)
		{
			System.out.println(fruit);
		}
	}
}
