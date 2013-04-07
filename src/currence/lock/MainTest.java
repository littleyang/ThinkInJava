package currence.lock;

/**
 * this is main test about the job lock test
 * @author jenny
 *
 */
public class MainTest {
	
	public static void main(String[] args){
		//declare the job print queue 
		PrintQueue queue = new PrintQueue();
		//declare a thread array for test 
		Thread threads[] = new Thread[10];
		//do some test,put the thread into the thread array
		for(int i = 0;i<10;i++){
			threads[i] = new Thread(new JobThread(queue));
		}
		//to start the ten thread
		for(int j=0;j<10;j++){
			threads[j].start();
		}
	}

}
