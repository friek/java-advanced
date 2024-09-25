package nl.mumasoft.jadvanced.patterns.strategy;

public class SwordBehaviour implements WeaponBehaviour
{
	@Override
	public void useWeapon()
	{
		System.out.println("Swinging a sword.");
	}
}
