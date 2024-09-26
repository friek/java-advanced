package nl.mumasoft.jadvanced.concurrency.cow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest
{
	public static void main(String[] args)
	{

//		List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
		List<Integer> numbers = new CopyOnWriteArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));

		System.out.println(numbers);

		for (int element : numbers)
		{
			if (element % 2 == 0 || element == 5)
			{
				// Use Integer.valueOf as it will otherwise the remove the element at the index of the element
				numbers.remove(Integer.valueOf(element));
			}
		}

		System.out.println(numbers);
	}
}
