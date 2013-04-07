package concurrence.semaphore.multi;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Java semaphore concurrence test class. declare a private semaphore and return
 * nothing
 * 
 * @author jenny
 * 
 */
public class PrintQueue {
	// declare a private attribute semaphore
	private final Semaphore semaphore;

	// declare a boolean array,This array stores printers that are free to print
	// a job and printers that are printing a document.
	private boolean freePrinters[];
	// protect the access to the freePrinters array
	private Lock lockPrinters;

	// implement the constructor for PrintQueue
	public PrintQueue() {
		semaphore = new Semaphore(3);
		freePrinters = new boolean[3];
		for (int i = 0; i < 3; i++) {
			freePrinters[i] = true;
		}
		lockPrinters = new ReentrantLock();
	}

	/*
	 * implements the printJobs method as void
	 */
	public void printJobs(Object document) {
		// try to acquire the semaphore according to acquire method
		try {
			semaphore.acquire();
			int assignedPrinter = getPrinter();
			long duration = (long) (Math.random() * 10);
			System.out
					.printf("%s: PrintQueue: Printing a Job in Printer %d during %d seconds\n",
							Thread.currentThread().getName(), assignedPrinter,
							duration);
			TimeUnit.SECONDS.sleep(duration);
			freePrinters[assignedPrinter] = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// to release the binnary mesaphore
			semaphore.release();
		}
	}

	/*
	 *It's a private method that returns an int value and it has no parameters. 
	 */
	private int getPrinter() {
		int ret = -1;
		try {
			lockPrinters.lock();
			for (int i = 0; i < freePrinters.length; i++) {
				if (freePrinters[i]) {
					ret = i;
					freePrinters[i] = false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lockPrinters.unlock();
		}
		return ret;

	}
}
