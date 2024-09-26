package nl.mumasoft.jadvanced.concurrency.lockandcondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Voorraad
{
	private static Voorraad instance;
	private int voorraad;
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition herbevoorrading = lock.newCondition();

	// Add concurrent fields here. e.g. Lock and Condition

	public static synchronized Voorraad getInstance()
	{
		if (instance == null)
			instance = new Voorraad();
		return instance;
	}

	public void increment()
	{
		lock.lock();
		try
		{
			if (voorraad++ == 0)
				herbevoorrading.signal();
			System.out.println("Voorraad verhoogd naar " + this.voorraad);
		}
		finally
		{
			lock.unlock();
		}
	}

	public void decrement()
	{
		lock.lock();
		try
		{
			while (voorraad == 0)
				herbevoorrading.await();

			voorraad--;
			System.out.println("Voorraad verlaagd naar " + this.voorraad);
		}
		catch (InterruptedException e)
		{
			// Not a best practice. Sufficient for now
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
	}


	public int getVoorraad()
	{
		return voorraad;
	}

	private Voorraad()
	{
	}
}
