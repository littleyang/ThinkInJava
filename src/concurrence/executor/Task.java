package concurrence.executor;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * this class show how to use Java concurrence API about the executor framework
 * this is the test basic to use framework to create an executor
 * 
 * @author jenny
 * 
 */
public class Task implements Runnable {

	// declare a initialized date for create Task
	private Date initDate;
	// declare a private string for task name
	private String name;

	/*
	 * implements constructor for the class
	 */
	public Task(String name) {
		initDate = new Date();
		this.name = name;
	}

	/*
	 * to override run method
	 */
	@Override
	public void run() {
		System.out.printf("%s: Task %s: Created on: %s\n", Thread
				.currentThread().getName(), name, initDate);
		System.out.printf("%s: Task %s: Started on: %s\n", Thread
				.currentThread().getName(), name, new Date());
		try {
			Long duration = (long) (Math.random() * 10);
			System.out.printf("%s: Task %s: Doing a task during %d seconds\n",
					Thread.currentThread().getName(), name, duration);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%s: Task %s: Finished on: %s\n",Thread.
				currentThread().getName(),name,new Date());
	}
	
}
