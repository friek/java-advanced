package nl.mumasoft.jadvanced.io;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RedirectTest
{
	/**
	 * Exercise 8 - IO redirection
	 *
	 * @throws IOException Not thrown
	 */
	@Test
	void testRedirection() throws IOException
	{
		PrintStream console = System.out;
		var baos = new ByteArrayOutputStream();
		try (var ps = new PrintStream(baos);
			 // Although ByteArrayOutputStream is a Closable, it doesn't actually do anything
			 baos)
		{
			System.setOut(ps);

			for (int i = 1; i <= 5; i++)
				System.out.printf("This is line '%d'%n", i);
		}
		finally
		{
			// Restore the original System.out
			System.setOut(console);
		}

		var notWritten = "Not written to baos";
		System.out.println(notWritten);

		var output = baos.toString();
		for (int i = 1; i <= 5; i++)
			assertTrue(output.contains(String.format("This is line '%d'%n", i)));

		assertFalse(output.contains(notWritten));
	}
}
