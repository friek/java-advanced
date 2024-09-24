package nl.mumasoft.jadvanced.skies;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SkiStoreTest
{
	@InjectMocks
	private SkiStore skiStore;
	@Mock
	private SkiService skiService;

	@Test
	void testRent()
	{
		// Given
		var skies = new Skies();
		var expected = 10.0;
		when(skiService.rent(skies)).thenReturn(expected);

		// When
		double actual = skiStore.rent(skies);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	void testSell()
	{
		// Given
		var skies = new Skies();
		var expected = true;
		when(skiService.checkForDamage(skies)).thenReturn(expected);

		// When
		boolean actual = skiStore.checkForDamage(skies);

		// Then
		assertEquals(expected, actual);
	}
}
