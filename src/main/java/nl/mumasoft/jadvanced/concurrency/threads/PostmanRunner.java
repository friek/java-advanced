package nl.mumasoft.jadvanced.concurrency.threads;

public class PostmanRunner
{
	public static void main(String[] args)
	{
		Postman postman = new Postman();
		new Thread(postman).start();
	}
}
