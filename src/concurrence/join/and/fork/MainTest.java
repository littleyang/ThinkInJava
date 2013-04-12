package concurrence.join.and.fork;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * this is the main test for join/fork test
 * 
 * @author jenny
 * 
 */
public class MainTest {
	public static void main(String[] args) {
		// create a generator to create product list
		ProductListGenerator generator = new ProductListGenerator();
		// create a product list
		List<Product> products = generator.productListGenerator(10000);
		// create task
		Task task = new Task(0, products.size(), products, 0.20);
		// create ForkJoinPool
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(task);
		do {
			System.out.printf("Main: Thread Count: %d\n",
					pool.getActiveThreadCount());
			System.out.printf("Main: Thread Steal: %d\n", pool.getStealCount());
			System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
			try {
				TimeUnit.MILLISECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (!task.isDone());
		pool.shutdown();
		if (task.isCompletedNormally()) {
			System.out.printf("Main: The process has completed normally.\n");
		}
		for (int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			if (product.getPrivce() != 12) {
				System.out.printf("Product %s: %f\n", product.getName(),
						product.getPrivce());
			}
		}
		System.out.println("Main: End of the program.\n");
	}
}
