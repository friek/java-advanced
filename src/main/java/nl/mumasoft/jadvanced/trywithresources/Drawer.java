package nl.mumasoft.jadvanced.trywithresources;

import java.util.HashSet;
import java.util.Set;

public class Drawer implements AutoCloseable
{
	private final Set<String> articles = new HashSet<>();
	private boolean open = true;

	public void add(String name)
	{
		articles.add(name);
	}

	@Override
	public void close()
	{
		open = false;
		System.out.println("Drawer is successfully closed");
	}

	public boolean isOpen()
	{
		return open;
	}
}
