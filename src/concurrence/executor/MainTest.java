package concurrence.executor;

/**
 * this is the main test about the executor test
 * @author jenny
 *
 */
public class MainTest {
	
	public static void main(String[] args){
		// create an object of Sever 
		Server server = new Server();
		// create some task for test
		for(int i =0;i<100;i++){
			Task task = new Task("task"+i);
			server.execute(task);
		}
		server.endServer();
	}

}
