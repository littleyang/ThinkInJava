package currence.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * this class is a test about the java lock which print the job queue
 * 
 * @author jenny
 * 
 */

public class PrintQueue {

	// declare a lock object of ReentrantLock
	private final Lock queueLock = new ReentrantLock();

	/*
	 * declare the print job print method as a void
	 */
	public void printJobs(Object document) {
		// to get the queue lock to synchronized the code block
		//在需要执行的代码块取得锁
		queueLock.lock();
		// try to do something to print the queue
		try {
			Long duration = (long) (Math.random() * 10000);
			System.out.println(Thread.currentThread().getName()
					+ ":PrintQueue: Printing a Job during " + (duration / 1000)
					+ " seconds");
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//finally to release the lock for other thread
		finally{
			//执行完成之后释放锁
			queueLock.unlock();
		}
		
	}
}
