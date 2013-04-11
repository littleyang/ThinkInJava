package concurrence.executor.lanch;

import java.util.concurrent.CompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ReporterProcess implements Runnable {

	//declare private CompletionService service
	private CompletionService<String> service;
	// declare a boolean type to check whether finished
	private boolean end;
	
	/*
	 * implements the constructor
	 */
	public ReporterProcess(CompletionService<String> service){
		this.service = service;
		end = false;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!end){
			try{
				Future<String> results = service.poll(20, TimeUnit.SECONDS);
				if(results!=null){
					String report = results.get();
					System.out.printf("ReportReceiver: Report Received:%s\n",report);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.printf("ReportSender: End\n");
	}
	
	public void setEnd(boolean end){
		this.end = end;
	}
}
