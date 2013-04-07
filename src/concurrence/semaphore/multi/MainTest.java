package concurrence.semaphore.multi;

/**
 * this is the main test for semaphore in java concurrence
 * 
 * @author jenny
 * 
 */
public class MainTest {
	public static void main(String[] args) {
		// declare the PrintQueue as a private
		PrintQueue queue = new PrintQueue();

		// Create 10 threads. Each one of those threads will execute a Job
		// object that will send
		// a document to the print queue.

		Thread thread[] = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(new Jobs(queue), "Thread" + i);
		}
		// finally to start all threads
		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}
	}

}
