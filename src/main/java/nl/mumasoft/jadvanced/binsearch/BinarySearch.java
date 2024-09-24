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

			System.out.println("Index of " + score + " is " + Arrays.binarySearch(scores, score));
		}
	}
}
