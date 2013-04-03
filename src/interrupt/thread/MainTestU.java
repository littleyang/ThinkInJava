package interrupt.thread;

public class MainTestU {
	
	public static void main(String[] args){
		
		Thread test = new InterruptThread();
		//start the test thread
		
		test.start();
		// try to interrupt the test thread
		try{
			Thread.sleep(5000);
		}catch( Exception e){
			e.printStackTrace();
		}	
		
		test.interrupt();
	}

}
