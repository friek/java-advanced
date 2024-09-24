package nl.mumasoft.jadvanced.trywithresources;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawerTest
{

	@Test
	void add()
	{
		var drawer = new Drawer();
		try (drawer)
		{
			String name = "Piet";
			String otherName = "Jan";
			String oneMore = "Karel";

			drawer.add(name);
			drawer.add(otherName);
			drawer.add(oneMore);
		}

		assertFalse(drawer.isOpen());
	}
}
