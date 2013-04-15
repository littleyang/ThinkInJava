package concurrence.collection.blocking.priority;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * this class is used to create event task ,which implements the Runnable interface
 * @author jenny
 *
 */
public class Task implements Runnable {

	// declare a private int attribute name id to store the identifies the task
	private int id;
	// declare a private PriorityBlockingDeque list parameterized with Event to store
	// the events that generator by the task
	private PriorityBlockingQueue<Event> queue ;
	
	/*
	 * implement the constructor method
	 */
	public Task(int id,PriorityBlockingQueue<Event> queue){
		this.id = id;
		this.queue = queue;
	}
	/*
	 * implement the run method
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// store 1000 events into the queue
		for (int i=0; i<1000; i++){
			Event event=new Event(id,i);
			queue.add(event);
		}
		
	}
	
}
