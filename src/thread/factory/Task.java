package thread.factory;

import java.util.concurrent.TimeUnit;

/*
 * a class to do nothing apart from sleep 1 second
 */
public class Task  implements Runnable{

	//override the method run
	@Override
	public void run(){
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
