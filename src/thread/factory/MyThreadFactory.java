package thread.factory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory{

	//store the numbers of object have been created by factory
	private int counter;
	//store the name have been created 
	private String name;
	//store the object status 
	private List<String> status;
	
	//define the constructor 
	public MyThreadFactory(String name){
		this.name = name;
		this.counter = 0;
		status = new ArrayList<String>();
	}
	//to override the create object method
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(r,name+"-Thread_"+counter);
		counter++;	// when a new object created,counter = counter + 1
		status.add(String.format("Created thread %d with name %s on %s\n",thread.getId(),thread.getName(),new Date()));
		//return the created thread
		return thread;
	}
	
	/*
	 * implement the get statistic method
	 * @return a String object with the statistical data of all the Thread objects created
	 */
	public String getStatus(){
		//return status string
		StringBuffer sb = new StringBuffer();
		//status iterator
		Iterator<String> it = status.iterator();
		//loop for get status
		while(it.hasNext()){
			sb.append(it.next());
			sb.append("\n");
		}
		//return the buffer to string
		return sb.toString();
	}
}
