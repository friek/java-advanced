package nl.mumasoft.jadvanced.navigable;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TrainSchedule
{
	private NavigableSet<LocalTime> schedule = new TreeSet<>(); // add a concrete class

	public TrainSchedule()
	{
		// add some times
		schedule.addAll(Arrays.asList(LocalTime.of(10, 30, 0),
				LocalTime.of(9, 30, 0),
				LocalTime.of(13, 15, 0),
				LocalTime.of(16, 30, 0)));
	}

	public LocalTime getTimeBefore(LocalTime time)
	{
		return schedule.lower(time);

	}

	public LocalTime getTimeAfter(LocalTime time)
	{
		return schedule.higher(time);
	}
}
