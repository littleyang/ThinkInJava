package concurrence.lock.readandrwirte;

/**
 * this class is the price reader thread which implements Runnable interface
 * 
 * @author jenny
 * 
 */
public class PriceReaderThread implements Runnable {

	// declare the price info object as private
	private PriceInfo priceInfo;

	/*
	 * implements the read class constructor
	 */
	public PriceReaderThread(PriceInfo priceInfo) {

		this.priceInfo = priceInfo;
	}

	/*
	 * implements the run method
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%s: Price 1: %f\n", Thread.currentThread().getName(), priceInfo.getPriceOne());
			System.out.printf("%s: Price 2: %f\n", Thread.currentThread().getName(), priceInfo.getPriceTwo());
		}
	}

}
