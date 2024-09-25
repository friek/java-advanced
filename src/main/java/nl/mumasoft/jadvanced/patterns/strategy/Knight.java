package nl.mumasoft.jadvanced.patterns.strategy;

public class Knight extends Character
{
	public Knight()
	{
		setWeaponBehaviour(new BowAndArrowBehaviour());
	}
}
