package nl.mumasoft.jadvanced.threads;

public class CounterThreadMain
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{
			new CounterThread(i).start();
		}
	}
}
