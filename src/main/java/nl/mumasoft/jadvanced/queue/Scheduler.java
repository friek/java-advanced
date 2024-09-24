package nl.mumasoft.jadvanced.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scheduler
{
	private final ArrayDeque<Task> tasks = new ArrayDeque<>();

	public void add(Task t)
	{
		if ("Willem-Alexander".equals(t.getPersonName()))
			tasks.addFirst(t);
		else
			tasks.add(t);
	}

	public void add(Collection<Task> tasks)
	{
		tasks.forEach(this::add);
	}

	public List<Task> execute()
	{
		final var executed = new ArrayList<Task>();
		tasks.forEach(t -> {
			t.execute();
			executed.add(t);
		});

		return executed;
	}
}
