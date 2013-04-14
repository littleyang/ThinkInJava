package concurrence.framework.concullection.nonblock;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * this is also a task for the concurrence non-block test
 * @author yangyang
 *
 */

public class PoolTask implements Runnable {

	// declare an list
	private ConcurrentLinkedDeque<String> list;
	/*
	 * implement the constructor method
	 */
	public PoolTask(ConcurrentLinkedDeque<String> list){
		this.list = list;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<5000; i++) {
			list.pollFirst();
			list.pollLast();
		}
	}
	
}
