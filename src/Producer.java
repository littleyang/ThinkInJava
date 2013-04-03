
public class Producer extends Thread{

	private int needNum;
	private Storiage stor;
	
	
	public Producer(int needNum,Storiage stor) {
		// TODO Auto-generated constructor stub
		this.needNum = needNum;
		this.stor = stor;
	}
	
	public void run(){
		stor.Produce(needNum);
	}

}
