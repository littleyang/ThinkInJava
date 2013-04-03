package broken;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SubTask extends Thread{

	private String name;
	private CyclicBarrier cb;
	
	public SubTask(String name,CyclicBarrier cb) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.cb = cb;
	}
	
	public void run(){
		System.out.println("子任务开始执行了！"+name);
		for(int i=0;i<9999999;i++);
		System.out.println("子任务已经完成"+name+"并且通知了障碍器");	
		try{
			cb.await();
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}catch(BrokenBarrierException ex){
			ex.printStackTrace();
		}
		
	}
}
