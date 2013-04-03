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
		System.out.println("������ʼִ���ˣ�"+name);
		for(int i=0;i<9999999;i++);
		System.out.println("�������Ѿ����"+name+"����֪ͨ���ϰ���");	
		try{
			cb.await();
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}catch(BrokenBarrierException ex){
			ex.printStackTrace();
		}
		
	}
}
