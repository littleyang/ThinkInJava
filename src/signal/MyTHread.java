package signal;

public class MyTHread extends Thread {

	private String threadName;
	private MyPool myPool;
	
	private int size;
	
	public MyTHread(String name,MyPool mypool,int size) {
		// TODO Auto-generated constructor stub
		this.threadName = name;
		this.myPool = mypool;
		this.size = size;
	}
	
	public void run(){
		try {
			myPool.getSp().acquire(size);
			System.out.println(threadName+"获取了："+size+"个信号！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			myPool.getSp().release(size);
			System.out.println(threadName+"释放了："+size+"个信号！");
		}
	}
}
