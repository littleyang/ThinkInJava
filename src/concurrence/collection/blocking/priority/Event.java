package concurrence.collection.blocking.priority;

/**
 * this example should learn how to use PriorityBlockingDeque class to store a list of
 * events which have different priority .
 * The concurrence blocking collection  priority will using Comparable interface and 
 * using compareTo() method,which return negative if parameter object less than local object
 * and return positive if parameter object more than the local object. and will return
 * the 0 if the parameter object equals the local object. and this is the thread safely,
 * which means that if the operations could not complete immediately, it will block the 
 * thread until it finished
 * @author jenny
 *
 */
public class Event implements Comparable<Event> {

	// declare a private int attribute named thread to store the number of the thread
	// that create the event
	private int thread;
	
	// declare a private int attribute name priority to store the priority of the envent
	private int priority;
	 
	/*
	 * implement the constructor method
	 */
	public Event(int thread,int priority){
		this.setThread(thread);
		this.setPriority(priority);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Event o) {
		// TODO Auto-generated method stub
		// implement the compareTo() method 
		if(o.priority<this.getPriority()){
			// if the Event o's priority less than local object return -1
			return -1;
		}else if(o.priority>this.getPriority()){
			// on the contrary,it return the 1
			return 1;
		}else{
			// if equals,return 0
			return 0;
		}
	}


	/*
	 * implement the get and set method
	 */
	public int getThread() {
		return thread;
	}


	public void setThread(int thread) {
		this.thread = thread;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}
