package nl.mumasoft.jadvanced.concurrency.threads;

public class Postman extends Person implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Postman delivering mail in thread " + Thread.currentThread().getName());
	}
}
