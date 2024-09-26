package nl.mumasoft.jadvanced.patterns.visitor;

public class Application
{
	public static void main(String[] args)
	{
		var visitor = new FruitCountingVisitor();

		new Apple().accept(visitor);
		new Banana().accept(visitor);
		new Pear().accept(visitor);

		var fruitmand = new Fruitmand();
		fruitmand.add(new Apple());
		fruitmand.add(new Pear());
		fruitmand.add(new Banana());
		fruitmand.add(new Banana());
		fruitmand.accept(visitor);

		System.out.println(visitor);
	}
}
