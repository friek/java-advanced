package nl.mumasoft.jadvanced.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileTester
{
	private static final String OUTPUT_FILE = "/tmp/food.txt";

	public static void main(String[] args) throws Exception
	{
		createFile();
		readFile();
		Files.delete(Paths.get(OUTPUT_FILE));
	}

	private static void createFile() throws IOException
	{
		try (var writer = new BufferedWriter(new FileWriter(OUTPUT_FILE)))
		{
			for (var food : Arrays.asList("Wienerschnitzel", "Boerenkool", "Frikandel speciaal"))
				writer.write(food + "\n");
		}
	}

	private static void readFile() throws IOException
	{
		try (var reader = new BufferedReader(new FileReader(OUTPUT_FILE)))
		{
			String food;
			while ((food = reader.readLine()) != null)
				System.out.println(food);
		}
	}
}
