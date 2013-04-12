package concurrence.join.and.fork.result.join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * this is the main test about the java concurrence join/fork framework
 * 
 * @author jenny
 * 
 */
public class MainTest {

	public static void main(String[] args) {
		// declare an document and create destination string matrix
		Document doc = new Document();
		String[][] document = doc.generateDocument(100, 1000, "the");

		// create doc task object
		DocumentTask docTask = new DocumentTask(document, 0, 100, "the");

		// declare ForkJoinPool object
		ForkJoinPool pool = new ForkJoinPool();
		// to execute the task
		pool.execute(docTask);
		do {
			System.out.printf("******************************************\n");
			System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
			System.out.printf("Main: Active Threads: %d\n",pool.getActiveThreadCount());
			System.out.printf("Main: Task Count: %d\n",
					pool.getQueuedTaskCount());
			System.out.printf("Main: Steal Count: %d\n", pool.getStealCount());
			System.out.printf("******************************************\n");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (!docTask.isDone());
		pool.shutdown();
		try {
			pool.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			System.out.printf("Main: The word appears %d in the document",docTask.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
