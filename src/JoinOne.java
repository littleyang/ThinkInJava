
public class JoinOne extends Thread {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("线程执行第"+i+"次");
		}
	}
}
