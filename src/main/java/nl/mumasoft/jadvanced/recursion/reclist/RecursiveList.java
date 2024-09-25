package nl.mumasoft.jadvanced.recursion.reclist;

public class RecursiveList<T>
{
	private T head;
	private RecursiveList<T> tail;

	public void add(T value)
	{
		if (head == null)
		{
			head = value;
			tail = new RecursiveList<>();
		}
		else
			tail.add(value);
	}

	public void pp()
	{
		if (head != null)
		{
			System.out.println(head);
			tail.pp();
		}
	}

	public boolean contains(T elem)
	{
		if (head == null)
			return false;
		else if (head.equals(elem))
			return true;

		return tail.contains(elem);
	}

	public int size()
	{
		if (head == null)
			return 0;
		else
			return 1 + tail.size();
	}
}
