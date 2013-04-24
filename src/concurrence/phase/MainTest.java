package concurrence.phase;

import java.util.concurrent.Phaser;

/**
 * this is the main test about phase
 * @author jenny
 *
 */
public class MainTest {
	
	public static void main(String[] args){
		// create Phaser with 3 operation 
		Phaser phaser = new Phaser(3);
		// create file searcher for system
		FileSearcher sys = new FileSearcher("C:/Windows", "log", phaser);
		// create file seacher for program
		FileSearcher app = new FileSearcher("C:/Program Files", "log", phaser);
		// create file searcher for document
		//FileSearcher doc = new FileSearcher("C:/Documents And Settings","log",phaser);
		//create sys thread for sys file searcher
		Thread sysThread = new Thread(sys);
		sysThread.start();
		//create app thread for app file searcher 
		Thread appThread = new Thread(app);
		appThread.start();
		//create doc thread for doc file searcher
		//Thread docThread = new Thread(doc);
		//docThread.start();
		//wait for the finalization three threads
		try{
			sysThread.join();
			appThread.join();
			//docThread.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		// Write the value of the finalized flag of the Phaser object using the isFinalized() method.
		System.out.println("Terminated: "+ phaser.isTerminated());
	}

}
