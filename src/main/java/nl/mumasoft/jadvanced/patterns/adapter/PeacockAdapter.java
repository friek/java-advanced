package nl.mumasoft.jadvanced.patterns.adapter;

public class PeacockAdapter implements Duck
{
	private final Peacock peacock;

	public PeacockAdapter(Peacock peacock)
	{
		this.peacock = peacock;
	}

	@Override
	public void quack()
	{
		peacock.sound();
	}

	@Override
	public void walk()
	{
		peacock.run();
	}
}
