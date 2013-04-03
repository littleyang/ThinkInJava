
public class Cuntomer extends Thread{

	private int needNum;
	private Storiage stor;
	
	public Cuntomer(int needNum,Storiage stor) {
		// TODO Auto-generated constructor stub
		this.needNum = needNum;
		this.stor = stor;
	}
	
	public void run(){
		stor.Consum(needNum);
	}
}
