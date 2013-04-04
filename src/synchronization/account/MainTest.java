package synchronization.account;

/**
 * this is the main test for account-bank-company
 * 
 * @author yangyang
 * 
 */
public class MainTest {

	public static void main(String[] args) {

		// declare the account
		Account account = new Account();
		account.setBalance(10000.00);

		// declare the bank thread
		Bank bank = new Bank(account);
		Thread bankThread = new Thread(bank);

		// declare the company thread
		Company company = new Company(account);
		Thread companyThread = new Thread(company);

		System.out.printf("Account : Initial Balance: %f\n",
				account.getBalance());
		// Start the threads.
		companyThread.start();
		bankThread.start();

		try {
			companyThread.join();
			bankThread.join();
			System.out.printf("Account : Final Balance: %f\n",
					account.getBalance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
