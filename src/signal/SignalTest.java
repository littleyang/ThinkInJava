package signal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SignalTest {

	public static void main(String[] args){
		MyPool myPool = new MyPool(20);
		ExecutorService pool = Executors.newFixedThreadPool(2);
		MyTHread t1 = new MyTHread("任务A", myPool, 3);
		MyTHread t2 = new MyTHread("任务B", myPool, 12);
		MyTHread t3 = new MyTHread("任务C", myPool, 7);
		
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		
		pool.shutdown();
	}
}
