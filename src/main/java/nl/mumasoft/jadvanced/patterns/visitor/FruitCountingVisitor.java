package nl.mumasoft.jadvanced.patterns.visitor;

public class FruitCountingVisitor implements Visitor
{
	private int apples;
	private int pears;
	private int bananas;

	@Override
	public void visit(Apple p)
	{
		this.apples++;
	}

	@Override
	public void visit(Pear pear)
	{
		this.pears++;
	}

	@Override
	public void visit(Fruitmand fruitmand)
	{
		for (Fruit f : fruitmand)
		{
			f.accept(this);
		}
	}

	@Override
	public void visit(Banana banana)
	{
		this.bananas++;
	}

	@Override
	public String toString()
	{
		return "FruitCounterVisitor{" +
				"apples=" + apples +
				", pears=" + pears +
				", bananas=" + bananas +
				'}';
	}
}
