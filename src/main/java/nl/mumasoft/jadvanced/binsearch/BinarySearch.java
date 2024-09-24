package nl.mumasoft.jadvanced.binsearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] scores = {55, 60, 67, 70, 72, 80, 85, 90, 95, 100};

		Scanner scanner = new Scanner(System.in);
		int score = 0;
		while (score != -1)
		{
			System.out.print("Enter a score to search for: ");
			score = scanner.nextInt();

			int pos = Arrays.binarySearch(scores, score);
			if (pos < 0)
				System.out.println("Score " + score + " not found. It should be inserted at index: " + (pos * -1 - 1));
			else
				System.out.println("Score " + score + " found at index: " + pos);
		}
	}
}
