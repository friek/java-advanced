package nl.mumasoft.jadvanced.patterns.strategy;

public class KnifeBehaviour implements WeaponBehaviour
{
	@Override
	public void useWeapon()
	{
		System.out.println("Stabbing with a knife.");
	}
}
