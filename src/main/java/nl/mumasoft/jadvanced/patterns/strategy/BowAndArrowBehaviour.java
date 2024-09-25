package nl.mumasoft.jadvanced.patterns.strategy;

public class BowAndArrowBehaviour implements WeaponBehaviour
{
	@Override
	public void useWeapon()
	{
		System.out.println("Shooting an arrow with a bow.");
	}
}
