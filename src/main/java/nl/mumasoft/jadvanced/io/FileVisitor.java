package nl.mumasoft.jadvanced.io;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitor
{
	public static void main(String[] args) throws IOException
	{
		var visitor = new StatisticsDirectoryTreeVisitor();
		var srcDir = Paths.get("src/main/java");
		Files.walkFileTree(srcDir, visitor);
		System.out.println("Total files: " + visitor.numFiles);
		System.out.println("Total size: " + visitor.totalSize);

		// Count java files with public int in it
		var publicIntVisitor = new PublicIntVisitor();
		Files.walkFileTree(srcDir, publicIntVisitor);
		System.out.println("Number of java files with public int: " + publicIntVisitor.count);
	}

	private static class StatisticsDirectoryTreeVisitor extends SimpleFileVisitor<Path>
	{
		int numFiles;
		long totalSize;

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
		{
			numFiles++;
			totalSize += attrs.size();

			return FileVisitResult.CONTINUE;
		}
	}

	private static class PublicIntVisitor extends SimpleFileVisitor<Path>
	{
		private int count;

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
		{
			if (!file.toString().endsWith(".java"))
				return FileVisitResult.CONTINUE;

			for (String line : Files.readAllLines(file))
			{
				if (line.contains("public int"))
				{
					count++;
					break;
				}
			}


			return FileVisitResult.CONTINUE;
		}
	}
}
