import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ObjectLock {
	
	public static void main(String[] args){
		
		ObjectLockMyAccount myAccount = new ObjectLockMyAccount("12341341234123", 100000);
		Lock myLock = new ReentrantLock();
		
		ExecutorService pool = Executors.newCachedThreadPool();
		
		ObjectLockUser u1 = new ObjectLockUser("张一", 1000, myAccount, myLock);
		ObjectLockUser u2 = new ObjectLockUser("张二", 1600, myAccount, myLock);
		ObjectLockUser u3 = new ObjectLockUser("张三", 1500, myAccount, myLock);
		ObjectLockUser u4 = new ObjectLockUser("张四", 1300, myAccount, myLock);
		
		pool.execute(u1);
		pool.execute(u2);
		pool.execute(u3);
		pool.execute(u4);
		
		pool.shutdown();
		
	}
}
