package CA1_2;
//The Counter class should create a thread that starts counting from 0 (0, 1, 2, 3 ...) and
//stores each value in the Repository class.
public class Counter implements Runnable
{

	private Respository repository;

	//
	public Counter (Respository repository)
	{
		this.repository = repository;
	}
	
	public void run() 
	{
//         int count = 0;
//         while (true) 
//        {
//            repository.setValue(count);
//            count++;
//        }
         
		
//       for (int count = 0; count <= 10; count++) 
//      {
//          
//    	   try 
//			{
//				Thread.sleep(300);
//				//  System.out.println(count);
//			}
//			catch(InterruptedException e)
//			{
//				e.printStackTrace();
//			}
//    	   repository.setValue(count);
//          
      
		
       for (int count = 0; count <= 10; count++) 
       {
    	   //uses synchronization to ensure that only one 
    	   //thread can change the Repository object at a time
           synchronized (repository) {
             //  repository.setValue(count);
               //System.out.println(count);
              
               
               try 
  			{
            	   
            	System.out.println(count);//prints out each number
  				Thread.sleep(300);
  				//to slow the counter so each number displays 
  				//300 ms at a time
 				 
 			}
 			catch(InterruptedException e)
 			{
  				e.printStackTrace();
   			}
           }
       }}}
		
    



