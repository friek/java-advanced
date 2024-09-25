package nl.mumasoft.jadvanced.threads;

public class CounterThread extends Thread
{
	private long id;

	public CounterThread(long id)
	{
		this.id = id;
	}

	@Override
	public void run()
	{
		System.out.println("Thread " + id + " started");
	}
}
