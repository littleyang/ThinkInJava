package concurrence.framework.concullection.block;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * this is the main test class for the blocking list
 * @author yangyang
 *
 */
public class MainTest {
	
	public static void main(String[] args){
		
		
		// declare an object using LinkedBlockingDeque parameterized with String
		LinkedBlockingDeque<String> list = new LinkedBlockingDeque<String>();
		// create thread object for client task
		Client client = new Client(list);
		Thread thread = new Thread(client);
		// start the thread
		thread.start();
		
		// get the three String object of the list every 300 millisecond using the take()
		// method of the list. repeat the loop five times , and out put the String to the
		// console
		try{
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				String request = list.take();
				System.out.printf("Main: Request: %s at %s. Size:%d\n",request,new Date(),list.size());
			}
			TimeUnit.MILLISECONDS.sleep(300);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
