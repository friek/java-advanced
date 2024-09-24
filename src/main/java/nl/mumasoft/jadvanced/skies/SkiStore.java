package nl.mumasoft.jadvanced.skies;

public class SkiStore
{
	private SkiService skiService;

	public double rent(Skies skies)
	{
		return skiService.rent(skies);
	}

	public boolean checkForDamage(Skies skies)
	{
		return skiService.checkForDamage(skies);
	}
}
