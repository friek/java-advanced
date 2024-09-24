package nl.mumasoft.jadvanced.trywithresources;

import java.util.*;

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
		open = false;
		System.out.println("Drawer is successfully closed");
	}

	public boolean isOpen()
	{
		return open;
	}

	public int size()
	{
		return articles.size();
	}

	public String articlesAsString()
	{
		var list = new ArrayList<>(articles);
		list.sort(String.CASE_INSENSITIVE_ORDER);
		return String.join(", ", list);
	}
}
