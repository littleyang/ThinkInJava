package concurrence.executor.finish;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * this class is used to do some example,which control a task  finishing in an executor
 * which is implement the Call-able interface in Java concurrence API
 * @author jenny
 *
 */
public class ExectutorTask implements Callable<String> {
	
	// declare a private string name
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	/*
	 * implement the constructor 
	 */
	public ExectutorTask(String name){
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		
		//do something 
		try{
			long duration=(long)(Math.random()*10);
			System.out.printf("%s: Waiting %d seconds for results.\n",this.name,duration);
			TimeUnit.SECONDS.sleep(duration);
		}catch(Exception e){
			
		}
		return "hello,world "+name;
	}
	
}
