package concurrence.lock.readandrwirte;

/**
 * this the main test about the read and write lock
 * 
 * @author jenny
 * 
 */
public class MainTest {

	public void main(String[] args) {
		// declare the PriceInfo object
		PriceInfo priceInfo = new PriceInfo();

		// declare the test reader thread array and test Reader info object
		PriceReaderThread readers[] = new PriceReaderThread[10];
		Thread readerThreads[] = new Thread[10];

		// declare the writer thread
		Thread writerThread = new Thread(new PriceWriterThread(priceInfo));

		// put the reader threads into thread array
		for (int i = 0; i < 10; i++) {
			readers[i] = new PriceReaderThread(priceInfo);
			readerThreads[i] = new Thread(readers[i]);
		}

		// to start the reader thread
		for (int j = 0; j < 10; j++) {
			readerThreads[j].start();
		}

		// start the writer thread
		writerThread.start();

	}

}
