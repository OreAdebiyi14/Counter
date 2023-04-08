package CA1_2;
import java.util.concurrent.atomic.AtomicInteger;

//The Repository class should store an integer.
//Update the program from Question 2 to ensure that each number is printed exactly once, by
//adding suitable synchronisation.

public class Respository
{
	//atomic operations on an int value
	private AtomicInteger value = new AtomicInteger(0);
	//additional lock object and a boolean flag
	//so each num is printed once
	private Object locked = new Object();
    private boolean Update = false;



	public int getValue() throws InterruptedException
	{
		//synchronisation
		synchronized (locked) {
            while (!Update) {
                locked.wait();
            }
            Update = false;
            return value.get();
        }

	}
	public void setValue(int value)
	{
		synchronized (locked) {
            this.value.set(value);
            Update = true;
            locked.notify();
        }
	}



}
