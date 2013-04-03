import java.util.concurrent.locks.Lock;


public class ObjectLockUser implements Runnable{

	private String name;
	private ObjectLockMyAccount myAccount;
	private int cash;
	private Lock myLock;
	
	public ObjectLockUser(String name,int cash,ObjectLockMyAccount myAccount,Lock myLock) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.myAccount = myAccount;
		this.cash = cash;
		this.myLock = myLock;
	}
	
	public void run(){
		myLock.lock();
		System.out.println(name + "���ڲ���" + myAccount + "�˻������Ϊ" +cash + "����ǰ���Ϊ" + myAccount.getCash());
		myAccount.setCash(myAccount.getCash() + cash);
		System.out.println(name + "����" + myAccount + "�˻��ɹ������Ϊ" +cash + "����ǰ���Ϊ" + myAccount.getCash());
		myLock.unlock();
	}	
}
