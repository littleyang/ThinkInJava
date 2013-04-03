
public class TestMyZRubable implements Runnable {
	
	private Foo myFoo = new Foo();
	
	public static void main(String[] args){
		
		TestMyZRubable r = new TestMyZRubable();
		
		Thread ta = new Thread(r,"thread-a");
		Thread tb = new Thread(r,"Thread-b");
		
		ta.start();
		tb.start();	
	}
	
	public void run(){
		for(int i=0;i<3;i++){
			this.fix(30);
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : 当前foo 对象的x 值= " + myFoo.getX());
		}
		
	}
	
	public int fix(int y){
		return myFoo.fix(y);
	}
}
