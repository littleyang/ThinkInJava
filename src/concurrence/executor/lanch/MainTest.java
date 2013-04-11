package concurrence.executor.lanch;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * this is the main test
 * 
 * @author jenny
 * 
 */
public class MainTest {
	public static void main(String[] args) {
		// create an object using EexecutorService
		ExecutorService executor = (ExecutorService) Executors
				.newCachedThreadPool();
		// create an object service using CompletionService
		CompletionService<String> service = new ExecutorCompletionService<String>(
				executor);
		ReportorRequest faceRequest = new ReportorRequest("Face", service);
		ReportorRequest onlineRequest = new ReportorRequest("Online", service);
		Thread faceThread = new Thread(faceRequest);
		Thread onlineThread = new Thread(onlineRequest);
		ReporterProcess processor = new ReporterProcess(service);
		Thread senderThread = new Thread(processor);
		System.out.printf("Main: Starting the Threads\n");
		faceThread.start();
		onlineThread.start();
		senderThread.start();
		try {
			System.out.printf("Main: Waiting for the report generators.\n");
			faceThread.join();
			onlineThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Main: Shutting down the executor.\n");
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
