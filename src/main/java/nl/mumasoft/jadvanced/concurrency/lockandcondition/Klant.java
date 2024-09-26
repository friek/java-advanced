package nl.mumasoft.jadvanced.concurrency.lockandcondition;

public class Klant
{
	private final Voorraad voorraad;

	public Klant(Voorraad voorraad)
	{
		this.voorraad = voorraad;
	}

	public void koop()
	{
		voorraad.decrement();
		try
		{
			Thread.sleep(100);
		}
		catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}

	}
}
