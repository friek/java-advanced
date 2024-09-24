package nl.mumasoft.jadvanced.queue;

public class Task
{

	private String personName;

	public Task(String personName)
	{
		this.personName = personName;
	}

	public void execute()
	{
		System.out.printf("Task for person '%s' executed!%n", personName);
	}

	public String getPersonName()
	{
		return personName;
	}
}
