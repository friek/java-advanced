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
		return Integer.compare(score, o.score);
	}

//	@Override
//	public int compareTo(Object o)
//	{
//		if (o instanceof Student other)
//		{
//			return Integer.compare(score, other.score);
//		}
//
//		throw new IllegalArgumentException("Can only compare to other Student objects");
//	}
}
