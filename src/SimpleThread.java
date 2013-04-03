
public class SimpleThread extends Thread{

	private int downCount;
	private int threadNum;
	private static int threadCount = 0;
	public SimpleThread(){
		threadNum = threadCount ++;
		System.out.println("Making£º "+threadNum);
	}
	
	public void run(){
		while(true){
			System.out.println("Thread " +threadNum+ "(" + downCount + ")");
					if(--downCount == 0) return;
		}
		
	}
	
	public static void main(String[] args){
		for(int i = 0; i < 5; i++)
			new SimpleThread().start();
			System.out.println("All Threads Started");
	}
}
