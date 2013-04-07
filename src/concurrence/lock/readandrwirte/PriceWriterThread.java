package concurrence.lock.readandrwirte;

/**
 * this is the price info writer thread which implements Runnable interface
 * 
 * @author jenny
 * 
 */
public class PriceWriterThread implements Runnable {

	// declare the Price info object as an pirvate
	private PriceInfo priceInfo;

	/*
	 * implements the constructor for the class
	 */
	public PriceWriterThread(PriceInfo info) {
		this.priceInfo = info;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.printf("Writer: Attempt to modify the prices.\n");
			priceInfo.setPrice(Math.random() * 10, Math.random() * 8);
			System.out.printf("Writer: Prices have been modified.\n");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
