package nl.mumasoft.jadvanced.binsearch;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class StudentScoreSearch
{
	private final Set<Student> students = new TreeSet<>(Student::compareTo);

	public void addStudent(Student student)
	{
		students.add(student);
	}

	/**
	 * Binary search by student
	 * @param student The student to search for
	 * @return The index at which the student is found, or the index at which it should be inserted
	 */
	public int binarySearch(Student student)
	{
		return Collections.binarySearch(students.stream().toList(), student);
	}
}
