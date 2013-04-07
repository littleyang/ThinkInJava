package concurrence.lock.multicondition;

import java.util.Random;

public class Consumer implements Runnable {

	/*
	 * Declare a Buffer object and implement the constructor of the class that
	 * initializes it.
	 */
	private Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	/*
	 * Implement the run() method. While the buffer has pending lines, it tries
	 * to get one and process it.
	 */
	@Override
	public void run() {
		while (buffer.hasPendingLines()) {
			String line = buffer.get();
			processLine(line);
		}
	}

	/*
	 * Implement the auxiliary method processLine(). It only sleeps for 10
	 * milliseconds to simulate some kind of processing with the line.
	 */
	private void processLine(String line) {
		try {
			Random random = new Random();
			Thread.sleep(random.nextInt(100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
