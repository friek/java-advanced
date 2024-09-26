package nl.mumasoft.jadvanced.patterns.visitor;

public class Apple extends Fruit
{

	@Override
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
}
