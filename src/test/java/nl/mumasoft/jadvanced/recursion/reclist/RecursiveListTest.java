package nl.mumasoft.jadvanced.recursion.reclist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveListTest
{
	@Test
	void testSize()
	{
		var list = new RecursiveList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		assertEquals(3, list.size());
	}

	@Test
	void testContains()
	{
		var list = new RecursiveList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		assertTrue(list.contains(3));
		assertFalse(list.contains(4));
	}
}
