package concurrence.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Java semaphore concurrence test class. declare a private semaphore
 * and return nothing
 * @author jenny
 *
 */
public class PrintQueue {
	//declare a private attribute semaphore
	private final Semaphore semaphore;
	
	//implement the constructor for PrintQueue
	public PrintQueue(){
		semaphore = new Semaphore(1);
	}
	/*
	 * implements the printJobs method as void
	 */
	public void printJobs(Object document){
		//try to acquire the semaphore according to acquire method
		try{
			semaphore.acquire();
			long duration=(long)(Math.random()*10);
			System.out.printf("%s: PrintQueue: Printing a Job during %d seconds\n",Thread.currentThread().getName(),duration);
			Thread.sleep(duration);
		}catch(Exception e ){
			e.printStackTrace();
		}finally{
			// to release the binnary mesaphore
			semaphore.release();
		}
	}
}
