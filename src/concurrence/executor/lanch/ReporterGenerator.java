package concurrence.executor.lanch;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ReporterGenerator implements Callable<String> {
	// declare an private string title
	private String title;
	// declare a private string sender
	private String sender;
	
	/*
	 * implements constructor method
	 */
	public ReporterGenerator(String title,String sender){
		this.title = title;
		this.sender = sender;
	}
	
	/*
	 * override the call() method
	 */
	@Override
	public String call() throws Exception{
		try {
			Long duration=(long)(Math.random()*10);
			System.out.printf("%s_%s: ReportGenerator: Generating a report during %d seconds\n",this.sender,this.title,duration);
			TimeUnit.SECONDS.sleep(duration);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		String ret = sender+" "+title;
		return ret;
	}
	

}
