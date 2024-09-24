package nl.mumasoft.jadvanced.functional;

import java.util.Arrays;
import java.util.Collection;

/**
 * Bonus question 2: apply a function to a collection
 */
public class Randomizer
{
	public static void main(String[] args)
	{
		doRandomization(Arrays.asList("one", "two", "three", "four", "five"), Randomizer::randomize);
	}

	private static void doRandomization(Collection<String> strings, RandomizeString randomizeString)
	{
		strings.stream()
				.map(randomizeString)
				.forEach(System.out::println);
	}

	private static String randomize(String s)
	{
		return s.chars()
				.mapToObj(i -> (char) i)
				.sorted((a, b) -> Math.random() > 0.5 ? 1 : -1)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();
	}
}
