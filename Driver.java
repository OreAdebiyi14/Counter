package CA1_2;

public class Driver 
{
	public static void main(String[] args) 
	{
		Respository repository = new Respository();
        Counter counter = new Counter(repository);
        Publisher publisher = new Publisher(repository);
        
        Thread counterThread = new Thread(counter);
        Thread publisherThread = new Thread(publisher);
        
        counterThread.start();
        publisherThread.start();

	}

}
