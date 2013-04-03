package signal;

import java.util.concurrent.Semaphore;

public class MyPool {

	private Semaphore sp;
	
	public MyPool(int size) {
		// TODO Auto-generated constructor stub
		
		this.sp = new Semaphore(size);
		
	}

	public Semaphore getSp() {
		return sp;
	}

	public void setSp(Semaphore sp) {
		this.sp = sp;
	}
}
