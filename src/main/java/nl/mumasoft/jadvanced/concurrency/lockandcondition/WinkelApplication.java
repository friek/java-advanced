package nl.mumasoft.jadvanced.concurrency.lockandcondition;

import java.util.concurrent.Executors;

public class WinkelApplication
{
	public static void main(String[] args)
	{
		Voorraad voorraad = Voorraad.getInstance();
		Klant klant = new Klant(voorraad);
		Bakker bakker = new Bakker(voorraad);

		try (var executor = Executors.newFixedThreadPool(5))
		{
			for (int i = 0; i < 50; i++)
			{
				executor.execute(klant::koop);
				executor.execute(bakker::bakEnLever);
			}
		}

		System.out.println("Got here");
	}
}
