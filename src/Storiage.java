
public class Storiage {
	
	private static final int Max_num = 100;
	private int currentNum ;
	
	public Storiage() {
		// TODO Auto-generated constructor stub
	}
	
	Storiage(int currentNum){
		this.currentNum = currentNum;
	}
	
	/*
	 * 
	 */
	
	public synchronized void Produce(int needNum){
		while(currentNum + needNum > Max_num){
			System.out.println("需要生产的数量："+needNum+"，超过剩余的："+(Max_num-currentNum)+"无法生产");
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		currentNum += needNum;
		System.out.println("已经生产了："+needNum);
		notifyAll();
	}
	
	public synchronized void Consum(int needNum){
		while(currentNum<needNum){
			System.out.println("目前的数量:"+currentNum+"无法满足需求！");
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		currentNum -=needNum;
		System.out.println("已经消费了："+needNum);
		notifyAll();
	}
	
}
