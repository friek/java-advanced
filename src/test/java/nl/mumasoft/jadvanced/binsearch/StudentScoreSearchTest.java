package nl.mumasoft.jadvanced.binsearch;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test case to check binary search on a collection of objects, in this case a "Student"
 */
class StudentScoreSearchTest
{
	private final StudentScoreSearch studentScoreSearch = new StudentScoreSearch();

	@ParameterizedTest
	@ArgumentsSource(StudentArgumentProvider.class)
	void testSearch(int[] scores, int searchScore, int expectedIndex)
	{
		// Given
		Arrays.stream(scores).forEach(score -> studentScoreSearch.addStudent(new Student(score)));

		// When
		int index = studentScoreSearch.binarySearch(new Student(searchScore));

		// Then
		assertEquals(expectedIndex, index);
	}

	private static class StudentArgumentProvider implements ArgumentsProvider
	{

		@Override
		public Stream<? extends Arguments> provideArguments(ExtensionContext context)
		{
			return Stream.of(
					// Scores, search score, expected index
					Arguments.of(new int[]{10, 7, 5}, 4, -1),
					Arguments.of(new int[]{3, 3, 1, 10}, 3, 1)
			);
		}
	}
}
