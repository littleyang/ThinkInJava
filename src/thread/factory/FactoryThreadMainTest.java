package thread.factory;

public class FactoryThreadMainTest {
	
	public static void main(String[] args){
		// create a instance MyThreadFactory
		MyThreadFactory mtf = new MyThreadFactory("MyThreadFactory");
		//create a instance task
		Task mt = new Task();
		
		//create new 10 thread object
		Thread thread;
		//output starting info
		System.out.println("start the threads: ");
		for(int i = 0;i < 10;i++){
			thread = mtf.newThread(mt);
			thread.start();
		}
		//factory status
		System.out.println("factory stauts: ");
		System.out.println(mtf.getStatus());
	}
}
