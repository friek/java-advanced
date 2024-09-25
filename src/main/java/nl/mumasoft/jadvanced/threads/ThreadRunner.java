package nl.mumasoft.jadvanced.threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadRunner
{
	public static void main(String[] args) throws ExecutionException, InterruptedException
	{
		var list = new ArrayList<String>();
		var futures = new ArrayList<Future<String>>();
		var results = new ArrayList<String>();
		int listSize = 100;
		try (var executor = Executors.newCachedThreadPool())
		{
			// this will enforce a failure as ArrayList is not thread safe
			for (int i = 0; i < listSize; i++)
			{
				futures.add(executor.submit(() -> {
					var s = Thread.currentThread().getName();
					list.add(Thread.currentThread().getName());

					return s;
				}));
			}

			for (var future : futures)
			{
				results.add(future.get());
			}
		}

		System.out.println("List size of generated items is " + list.size());
		var failures = listSize - list.size();
		if (failures > 0)
			System.err.println(listSize - list.size() + " failures in list additions");

		System.out.println(String.join(", ", list));
		System.out.println(String.join(", ", results));
	}
}
