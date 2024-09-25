package nl.mumasoft.jadvanced.patterns.strategy;

public class King extends Character
{
	public King()
	{
		setWeaponBehaviour(new BowAndArrowBehaviour());
	}
}
