
public class ThreadA {

	public static void main(String[] args) throws InterruptedException{
		ThreadB tb = new ThreadB();
		tb.start();
		
		synchronized(tb){
			try{
				System.out.println("�ȴ��߳�Bִ��!");
				tb.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("toatal:"+tb.total);
		}
	}
}
