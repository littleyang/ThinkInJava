
public class ThreadB extends Thread {

	int total;
	
	public void run(){
		synchronized (this) {
			for(int i=0;i<1000001;i++){
				total+=i;
			}
			notify();
		}
	}
}
