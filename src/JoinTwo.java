
public class JoinTwo  {	
	
	public static void main(String[] args){
		JoinOne td = new JoinOne();
		td.start();
		
		for(int i=0;i<20;i++){
			System.out.println("���߳�ִ�е�"+i+"��");
			if(i>5){
				try{
					td.join();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}

}
