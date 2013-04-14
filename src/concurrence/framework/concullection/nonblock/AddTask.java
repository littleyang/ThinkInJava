package concurrence.framework.concullection.nonblock;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Java concurrence API provide non-block Collection framework .
 * which the operation on this collection could not be completed immediately,such an an list is none.
 * it will return null or throw an exception,an the thread will not be blocked.
 * class ConcurrentLinkedDeque is one of them
 * @author yangyang
 *
 */
public class AddTask  implements Runnable{
	
	// declare a Deque list
	private ConcurrentLinkedDeque<String> queue ;
	
	/*
	 * implement the constructor method
	 */
	public AddTask(ConcurrentLinkedDeque<String> queue){
		this.queue = queue;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		for(int i=0;i<10000;i++){
			queue.add("name========"+name+i);
		}
		
	}

}
