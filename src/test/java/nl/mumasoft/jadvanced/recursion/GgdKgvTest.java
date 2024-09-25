package nl.mumasoft.jadvanced.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GgdKgvTest
{
	@Test
	void testKgv()
	{
		assertEquals(300, GgdKgv.kgv(30, 100));
		assertEquals(135, GgdKgv.kgv(15, 27));
	}

	@Test
	void testGgd()
	{
		assertEquals(10, GgdKgv.ggd(100, 30));
		//https://nl.wikipedia.org/wiki/Grootste_gemene_deler#Voorbeelden
		assertEquals(5, GgdKgv.ggd(15, 20));
	}
}
