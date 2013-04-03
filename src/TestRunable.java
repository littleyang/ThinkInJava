
public class TestRunable {

	public static void main(String[] args){
		
		DoSomething ds1 = new DoSomething("first");
		DoSomething ds2 = new DoSomething("second");
		 Thread thread1 = new Thread(ds1);
		 Thread thread2 = new Thread(ds2);
		 
		 thread1.start();
		 thread2.start();
	}
}
