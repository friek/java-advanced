package nl.mumasoft.jadvanced.recursion;

/**
 * @link <a href="https://nl.wikipedia.org/wiki/Algoritme_van_Euclides">Euclides algoritme</a>
 */
public class GgdKgv
{
	/**
	 * Calculate the greatest common divisor of two numbers.
	 *
	 * @link <a href="https://nl.wikipedia.org/wiki/Grootste_gemene_deler">Grootste gemene deler</a>
	 */
	public static int ggd(int n, int m)
	{
		if (n % m == 0)
			return m;

		return ggd(m, n % m);
	}

	/**
	 * Calculate the least common multiple of two numbers.
	 *
	 * @link <a href="https://nl.wikipedia.org/wiki/Kleinste_gemene_veelvoud">Kleinste gemene veelvoud</a>
	 */
	public static int kgv(int n, int m)
	{
		return (n * m) / ggd(n, m);
	}
}
