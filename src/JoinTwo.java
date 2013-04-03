
public class JoinTwo  {	
	
	public static void main(String[] args){
		JoinOne td = new JoinOne();
		td.start();
		
		for(int i=0;i<20;i++){
			System.out.println("主线程执行第"+i+"次");
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
