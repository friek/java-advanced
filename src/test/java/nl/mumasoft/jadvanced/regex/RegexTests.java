package nl.mumasoft.jadvanced.regex;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class RegexTests
{
	@Test
	void testPostcodes()
	{
		var p = Pattern.compile("[1-9][0-9]{3}\\s?[A-Za-z]{2}");
		for (var postcode : Arrays.asList("7604AB", "7604 AB", "7604ab", "7604 ab"))
			assertTrue(p.matcher(postcode).matches());
	}

	@Test
	void testEmail()
	{
		var p = Pattern.compile("[^@\\s]+@([a-z0-9]+\\.)+([a-z]{2,})");
		// Valid
		for (var email : Arrays.asList("a@test.nl", "test@test.test.nl", "test@test.test.test.domain"))
			assertTrue(p.matcher(email).matches());
		// Invalid
		for (var email : Arrays.asList("a@test@test.nl", " @test.nl", "test@test"))
			assertFalse(p.matcher(email).matches());
	}

	@Test
	void semver()
	{
		var p = Pattern.compile("([0-9]+\\.){2}[0-9]+(-[a-zA-Z0-9]+)?");
		// Valid
		for (var version : Arrays.asList("1.1.1", "0.1.0", "10.500.1", "1.1.1-alpha", "1.1.1-alpha1"))
			assertTrue(p.matcher(version).matches());
		// Invalid
		for (var version : Arrays.asList("1.a.1", "0.1.0x", "1.1.1-alpha.1"))
			assertFalse(p.matcher(version).matches());
	}

	@Test
	void ipAddress()
	{
		var p = Pattern.compile("(([1-9]|1[0-9]|2[0-5])?[0-9]\\.){3}([1-9]|1[0-9]|2[0-5])?[0-9]");
		// Valid
		for (var ip : Arrays.asList("127.0.0.1", "192.168.0.1", "10.0.0.1"))
			assertTrue(p.matcher(ip).matches());
		// Invalid
		for (var ip : Arrays.asList("327.0.0.1", "192.168.0", "1000.0.0.1"))
			assertFalse(p.matcher(ip).matches());

	}

	@Test
	void parser()
	{
		String sentence = "I was born on 09-08-1968 and that was a Friday!!!";
		Optional<LocalDate> localDateOptional = parseDateFromString(sentence);
		assertTrue(localDateOptional.isPresent());

		LocalDate birthDate = localDateOptional.get();
		assertEquals(9, birthDate.getDayOfMonth(), "Day must be 9 here");
		assertEquals(8, birthDate.getMonthValue(), "Month must be 8 here");
		assertEquals(1968, birthDate.getYear(), "Year must be 1968 here");

	}

	private Optional<LocalDate> parseDateFromString(String sentence)
	{
		var p = Pattern.compile(".*\\s([0-9]{2}-[0-9]{2}-[0-9]{4}).*");
		var matcher = p.matcher(sentence);

		if (matcher.matches())
		{
			var date = matcher.group(1);
			return Optional.of(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		}

		return Optional.empty();
	}

}
