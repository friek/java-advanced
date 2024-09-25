package nl.mumasoft.jadvanced.patterns.strategy;

public class Application
{
	public static void main(String[] args)
	{
		System.out.println("== Knight");
		Character k = new Knight();
		k.performUseWeapon();

		System.out.println("== King");
		k = new King();
		k.performUseWeapon();

		System.out.println("== Now the Knight can also use Sword ... ");
		k = new Knight();
		k.setWeaponBehaviour(new SwordBehaviour());
		k.performUseWeapon();

		System.out.println("== King will use Knife");
		k.setWeaponBehaviour(new KnifeBehaviour());
		k.performUseWeapon();
	}
}
