package nl.mumasoft.jadvanced.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTesterNio2
{
	private static final Path OUTPUT_FILE = Path.of("/tmp/nio-food.txt");

	public static void main(String[] args) throws Exception
	{
		createFile();
		readFile();
		Files.delete(OUTPUT_FILE);
	}

	private static void createFile() throws IOException
	{
		Files.writeString(OUTPUT_FILE, String.join("\n", "Wienerschnitzel", "Boerenkool", "Frikandel speciaal"));
	}

	private static void readFile() throws IOException
	{
		Files.lines(OUTPUT_FILE).forEach(System.out::println);
	}
}
