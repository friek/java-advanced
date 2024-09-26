package nl.mumasoft.jadvanced.concurrency.lockandcondition;

public class Bakker
{
	private final Voorraad voorraad;

	public Bakker(Voorraad voorraad)
	{
		this.voorraad = voorraad;
	}

	public void bakEnLever()
	{
		voorraad.increment();
	}
}
