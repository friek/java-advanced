package nl.mumasoft.jadvanced.queue;

import java.util.*;

public class Scheduler
{
	private final Deque<Task> tasks = new ArrayDeque<>();

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
		var executed = new ArrayList<Task>();
		tasks.forEach(task -> {
			task.execute();
			executed.add(task);
		});

		return executed;
	}
}
