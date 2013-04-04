package synchronization.account;

/**
 * this class is to Add mount to account
 * @author yangyang
 * to implement the Runnable interface
 */
public class Company implements Runnable {
	
	//declare the account as private
	private Account account;
	//implement the constructor method
	public Company(Account account) {
		// TODO Auto-generated constructor stub
		this.account = account;
	}
	
	/*
	 * to override the run method
	 */
	@Override
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("AddAmount: ");
			account.addAmount(1000);
		}
	}

}
