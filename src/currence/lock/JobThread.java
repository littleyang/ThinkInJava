package currence.lock;

/**
 * this is the job lock class thread class 
 * which implement the Runnable interface
 * @author jenny
 *
 */
public class JobThread implements Runnable{
	
	//declare the job lock object as an private 
	private PrintQueue queue;
	
	/*
	 * implement the constructor method
	 */
	public JobThread(PrintQueue queue){
		this.queue = queue;
	}
	
	/*
	 * to override the run method to execute the thread
	 */
	@Override
	public void run(){
		
		System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
		queue.printJobs(new Object());
		System.out.printf("%s: The document has been printed\n",Thread.currentThread().getName());
		
	}

}
