package nl.mumasoft.jadvanced.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchedulerTest
{
	private Scheduler scheduler = new Scheduler();

	@Test
	void testExecute()
	{
		// Given
		scheduler.add(new Task("Johan"));
		scheduler.add(new Task("Ricardo"));
		scheduler.add(new Task("Raymond"));
		scheduler.add(new Task("Willem-Alexander"));

		// When
		var executedTasks = scheduler.execute();

		// Then
		assertEquals("Willem-Alexander", executedTasks.getFirst().getPersonName());
	}
}
