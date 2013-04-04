package synchronization.account;

/**
 * this class to subtract the Account
 * @author yangyang
 *
 */
public class Bank implements Runnable {

	// declare the Account as an private attributes
	private Account account;

	// implement the constructor method
	public Bank(Account account) {
		// TODO Auto-generated constructor stub

		this.account = account;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run() to override the run method
	 */
	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("susbtractAmount: ");
			account.sustractAmount(100);
		}

	}
}
