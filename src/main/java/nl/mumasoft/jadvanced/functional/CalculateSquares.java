package nl.mumasoft.jadvanced.functional;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class CalculateSquares
{

	public static void main(String[] args)
	{
		applyFunction(new int[]{1, 2, 3, 4, 5}, i -> i * i);
		applyFunctionWithUnaryOperator(new int[]{1, 2, 3, 4, 5}, i -> i * i);
	}

	private static void applyFunction(int[] intList, Square square)
	{
		Arrays.stream(intList).forEach(i -> System.out.println("Square of " + i + " is " + square.apply(i)));
	}

	/**
	 * Bonus question 1: IntUnaryOperator <-> Square
	 * @param intList List of ints
	 * @param square  The function to apply
	 */
	private static void applyFunctionWithUnaryOperator(int[] intList, IntUnaryOperator square)
	{
		Arrays.stream(intList).forEach(i -> System.out.println("Square of " + i + " is " + square.applyAsInt(i)));
	}
}
