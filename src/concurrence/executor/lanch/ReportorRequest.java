package concurrence.executor.lanch;

import java.util.concurrent.CompletionService;

public class ReportorRequest implements Runnable {

	// declare a String name to store the ReportRequest
	private String name;
	// declare a CompleteService attribute and string as parameter
	private CompletionService<String> service;
	
	/*
	 * implements constructor method
	 */
	public ReportorRequest(String name,CompletionService<String> service){
		this.name = name;
		this.service = service;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ReporterGenerator reporterGenerator = new ReporterGenerator(name, "Report");
		service.submit(reporterGenerator);
		
	}
	

}
