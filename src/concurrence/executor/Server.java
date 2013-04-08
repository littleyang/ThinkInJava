package concurrence.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * this class use executor to execute every task
 * 
 * @author jenny
 * 
 */
public class Server {

	// declare an executor pool use ThreadPoolExecutor
	private ThreadPoolExecutor executor;

	/*
	 * implement about the constructor
	 */
	public Server() {
		executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
	}

	/*
	 * implements the execute task method
	 */
	public void execute(Task task) {
		System.out.printf("Server: A new task has arrived\n");
		executor.execute(task);
		System.out.printf("Server: Pool Size: %d\n", executor.getPoolSize());
		System.out.printf("Server: Active Count: %d\n",
				executor.getActiveCount());
		System.out.printf("Server: Completed Tasks: %d\n",
				executor.getCompletedTaskCount());

	}

	
	/*
	 * to end up executor
	 */
	public void endServer() {
		executor.shutdown();
	}

}
