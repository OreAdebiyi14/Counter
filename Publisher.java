package CA1_2;
//The Publisher class should create a thread that keeps reading the value in the
//Repository class and printing it.

public class Publisher extends Thread
{

	private Respository repository;
	
	public Publisher(Respository repository) 
	{
        this.repository = repository;
    }
	
	public void run() 
	{
		while (true) {
			//updated try and catch
			try {
                int value = repository.getValue();
                System.out.println(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			
            /*try {
				System.out.println(repository.getValue());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
        }
		
	}

}
