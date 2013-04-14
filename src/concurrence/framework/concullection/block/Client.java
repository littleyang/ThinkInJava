package concurrence.framework.concullection.block;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * The most basic collection is the list. A list has an undetermined number of elements 
 * and you can add, read, or remove the element from any position. 
 * A concurrent list allows various threads to add or 
 * remove elements in the list at a time without producing any data inconsistency.
 * this class is the one that using blocking list. the main difference between the non-blocking 
 * list is that blocking-list has methods to insert and delete the elements on it that,if they 
 * can't do the operation immediately,because the list is full or empty,they block the thread
 * that make the call until the operation can be made.
 * Java includes the LinkedBlockingDeque class that implements a blocking list 
 *
 * @author yangyang
 * 
 */
public class Client implements Runnable{
	
	// declare a private LinkedBlockingDeque attribute parameterized with String
	private LinkedBlockingDeque<String> requestList;
	
	/*
	 * implement the constructor method
	 */
	public Client(LinkedBlockingDeque<String> requestList){
		this.requestList = requestList;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 * implement the run method。
	 * insert five String object in the list per second using put() method
	 * of the requestList. repeat that loop three times 
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				StringBuilder request = new StringBuilder();
				request.append(i).append(":").append(j);
				try{
					requestList.put(request.toString());
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		// sleep one second
		try{
			TimeUnit.SECONDS.sleep(2);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.printf("Client: End.\n");
	}

	
}
