package concurrence.collection.blocking.priority;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * this is the main test class method for the concurrence blocking list priority
 * @author jenny
 *
 */
public class MainTest {
	
	public static void main(String[] args){
		
		// create an object using class PriorityBlockingQueue
		PriorityBlockingQueue<Event> queue = new PriorityBlockingQueue<Event>();
		// create 5 thread for the task
		Thread taskThreads[]=new Thread[5];
		// create the task for the thread
		for(int i=0;i<taskThreads.length;i++){
			Task task = new Task(i,queue);
			taskThreads[i] = new Thread(task);
			// start the thread
			taskThreads[i].start();
		}
		// wait for the threads finalization using the join method
		for (int i=0; i<taskThreads.length ; i++){
			try{
				taskThreads[i].join();	
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.printf("Main: Queue Size: %d\n",queue.size());
		for (int i=0; i<taskThreads.length*1000; i++){
			Event event=queue.poll();
			System.out.printf("Thread %s: Priority %d\n",event.getThread(),event.getPriority());
		}
		System.out.printf("Main: Queue Size: %d\n",queue.size());
		System.out.printf("Main: End of the program\n");
	}

}
