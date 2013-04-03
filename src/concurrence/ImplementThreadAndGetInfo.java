package concurrence;

public class ImplementThreadAndGetInfo implements Runnable{
	
	
	//定义一个标识变量
	private int number;
	
	ImplementThreadAndGetInfo(int num){
		this.number = num;
	}

	//override the run method
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// loop for get some information
		for(int i=1;i<=10;i++){
			System.out.printf("current thread %s: %d * %d = %d\n",Thread.currentThread().getName(),number,i,i*number);
		}
		
	}
	
	

}
