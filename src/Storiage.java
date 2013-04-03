
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
			System.out.println("��Ҫ������������"+needNum+"������ʣ��ģ�"+(Max_num-currentNum)+"�޷�����");
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		currentNum += needNum;
		System.out.println("�Ѿ������ˣ�"+needNum);
		notifyAll();
	}
	
	public synchronized void Consum(int needNum){
		while(currentNum<needNum){
			System.out.println("Ŀǰ������:"+currentNum+"�޷���������");
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		currentNum -=needNum;
		System.out.println("�Ѿ������ˣ�"+needNum);
		notifyAll();
	}
	
}
