package synchronization.account;

public class Account {

	// the account balance attributes
	private double balance;

	// get and set method
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*
	 * the add account method
	 */
	public synchronized void addAmount(double amount) {
		// add the balance to amount
		double tmp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp += amount;
		balance = tmp;

	}
	
	/*
	 * the reduce the account
	 */
	public synchronized void sustractAmount(double amount){
		// do decrease the balance by amount
		double tem = balance;
		try {
			Thread.sleep(10);
		}catch(Exception e){
			e.printStackTrace();
		}
		tem = tem - amount;
		balance = tem;
	}

}
