package concurrence.semaphore;

/**
 * this is the semaphore thread 
 * which implements the Runnable interface
 * @author jenny
 *
 */
public class Jobs implements Runnable {
	// declare the PrintQueue object as an private 
	private PrintQueue queue;
	
	/*
	 * implement the construstor method to initialize the Jobs
	 */
	public Jobs(PrintQueue q){
		this.queue = q;
	}
	
	/*
	 * to override the run method
	 */
	@Override
	public void run(){
		System.out.printf("%s: Going to print a job\n",Thread.currentThread().getName());
		// it calls the printJob() method of the PrintQueue object.
		queue.printJobs(new Object());
		// the method writes a message to the console that shows that it has finished its execution.
		System.out.printf("%s: The document has been printed\n",Thread.currentThread().getName());
	}
	
	
	
}
