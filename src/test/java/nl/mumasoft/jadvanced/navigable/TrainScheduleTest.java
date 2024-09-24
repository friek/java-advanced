package nl.mumasoft.jadvanced.navigable;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

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
		assertEquals(LocalTime.of(16, 0, 0),
				trainSchedule.getTimeAfter(LocalTime.of(13, 15, 0)));
	}
}
