package nl.mumasoft.jadvanced.trywithresources;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
class DrawerTest
{
	@InjectMocks
	private Drawer drawer;
	@Mock
	private Set<String> articles;

	@Test
	void add()
	{
		var drawer = new Drawer();
		try (drawer)
		{
			drawer.add("Piet");
			drawer.add("Jan");
			drawer.add("Karel");
		}

		assertFalse(drawer.isOpen());
		assertEquals("Jan, Karel, Piet", drawer.articlesAsString());
	}

	@Test
	void testUsingMockito()
	{
		// Given
		Mockito.when(articles.size()).thenReturn(5);

		// When
		int size = drawer.size();

		// Then
		assertEquals(5, size);
	}
}
