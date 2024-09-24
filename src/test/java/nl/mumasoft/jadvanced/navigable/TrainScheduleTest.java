package nl.mumasoft.jadvanced.navigable;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class TrainScheduleTest
{
	private final TrainSchedule trainSchedule = new TrainSchedule();

	@Test
	void testTimeBefore()
	{
		assertEquals(LocalTime.of(13, 15, 0),
				trainSchedule.getTimeBefore(LocalTime.of(16, 0, 0)));
	}

	@Test
	void testTimeAfter()
	{
		assertEquals(LocalTime.of(16, 30),
				trainSchedule.getTimeAfter(LocalTime.of(14, 0)));
	}

	@Test
	void navigableTests()
	{
		// Just some test cases to check out NavigableSet behaviour
		var schedule = trainSchedule.getSchedule();

		// All times after 10:30
		var after1030 = schedule.tailSet(LocalTime.of(10, 30), false);
		assertIterableEquals(Arrays.asList(LocalTime.of(13, 15), LocalTime.of(16, 30)), after1030);

		// All times before 13:15
		var before1315 = schedule.headSet(LocalTime.of(13, 15), false);
		assertIterableEquals(Arrays.asList(LocalTime.of(9, 30), LocalTime.of(10, 30)), before1315);
	}
}
