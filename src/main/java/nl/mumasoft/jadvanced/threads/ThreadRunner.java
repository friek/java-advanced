package nl.mumasoft.jadvanced.threads;

import java.util.ArrayList;
import java.util.concurrent.Executors;

public class ThreadRunner
{
	public static void main(String[] args)
	{
		var list = new ArrayList<String>();
		int listSize = 100;
		try (var executor = Executors.newCachedThreadPool())
		{
			// this will enforce a failure as ArrayList is not thread safe
			for (int i = 0; i < listSize; i++)
				executor.submit(() -> list.add(Thread.currentThread().getName()));
		}

		System.out.println("List size of generated items is " + list.size());
		var failures = listSize - list.size();
		if (failures > 0)
			System.err.println(listSize - list.size() + " failures in list additions");
		System.out.println(String.join(", ", list));
	}
}
