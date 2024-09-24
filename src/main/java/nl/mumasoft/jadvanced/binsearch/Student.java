package nl.mumasoft.jadvanced.binsearch;

public class Student implements Comparable<Student>
{
	private int score;

	public Student(int score)
	{
		this.score = score;
	}

	public int getScore()
	{
		return score;
	}

	@Override
	public int compareTo(Student o)
	{
//		Integer.compare(score, o.score);
		// Alternatief:
		return score - o.score;
	}
}
