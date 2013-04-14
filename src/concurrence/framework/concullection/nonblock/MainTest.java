package concurrence.framework.concullection.nonblock;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * this is the main test for the nonblock test
 * 
 * @author yangyang
 * 
 */
public class MainTest {

	public static void main(String[] args) {
		// create an ConcurrentLinkedDeque object
		ConcurrentLinkedDeque<String> list = new ConcurrentLinkedDeque<>();

		// create 100 thread object
		Thread threads[] = new Thread[100];

		// create 100 AddTask object and a thread to run them
		for (int i = 0; i < threads.length; i++) {
			AddTask task = new AddTask(list);
			threads[i] = new Thread(task);
			threads[i].start();
		}
		System.out.printf("Main: %d AddTask threads have been launched\n",
				threads.length);
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Main: Size of the List: %d\n", list.size());
		for (int i = 0; i < threads.length; i++) {
			PoolTask task = new PoolTask(list);
			threads[i] = new Thread(task);
			threads[i].start();
		}
		System.out.printf("Main: %d PollTask threads have been launched\n",
				threads.length);
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Main: Size of the List: %d\n", list.size());
	}
}
