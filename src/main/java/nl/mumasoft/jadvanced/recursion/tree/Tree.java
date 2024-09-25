package nl.mumasoft.jadvanced.recursion.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree<T extends Comparable<T>>
{
	private T value;
	private Tree<T> left;
	private Tree<T> right;

	public void add(T t)
	{
		if (value == null)
		{
			value = t;
			left = new Tree<>();
			right = new Tree<>();
		}
		else if (t.compareTo(value) < 0)
			left.add(t);
		else
			right.add(t);
	}

	public void pp()
	{
		if (value != null)
		{
			left.pp();
			System.out.println(value);
		}
	}

	public List<T> toList()
	{
		var list = new ArrayList<T>();
		traverse(list);

		return list;
	}

	private void traverse(List<T> list)
	{
		if (value != null)
		{
			left.traverse(list);
			list.add(value);
			right.traverse(list);
		}
	}

	public int size()
	{
		if (value == null)
			return 0;

		return 1 + left.size() + right.size();
	}
}
