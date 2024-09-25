package nl.mumasoft.jadvanced.patterns.adapter;

public class WildPeacock implements Peacock
{
	@Override
	public void run()
	{
		System.out.println("Running Peacock (Pauw)");
	}

	@Override
	public void sound()
	{
		System.out.println("Oh wauw, oh wauw, oh wauw");
	}
}
