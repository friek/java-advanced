package nl.mumasoft.jadvanced.trywithresources;

import java.util.HashSet;
import java.util.Set;

public class Drawer implements AutoCloseable
{
	private Set<String> articles = new HashSet<>();
	private boolean open = true;

	public void add(String name)
	{
		articles.add(name);
	}

	@Override
	public void close()
	{
		System.out.println("Drawer is successfully closed");
		open = false;
	}

	public boolean isOpen()
	{
		return open;
	}
}
