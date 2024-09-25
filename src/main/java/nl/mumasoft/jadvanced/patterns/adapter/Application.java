package nl.mumasoft.jadvanced.patterns.adapter;

public class Application
{
	public static void main(String[] args)
	{
		Duck d = new PeacockAdapter(new WildPeacock());
		d.walk();
		d.quack();
	}
}
