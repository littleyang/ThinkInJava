
public class ProducerAndConsumer {

	public static void main(String[] args){
		Storiage stor = new Storiage(50); 
		Cuntomer com1 = new Cuntomer(15, stor);
		Cuntomer com2 = new Cuntomer(10,stor);
		Cuntomer com3 = new Cuntomer(10, stor);
		
		Producer pro1 = new Producer(30, stor);
		Producer pro2 = new Producer(20, stor);
		Producer pro3 = new Producer(10, stor);
		Producer pro4 = new Producer(50, stor);
		com1.start();
		com2.start();
		com3.start();
		
		pro1.start();
		pro2.start();
		pro3.start();
		pro4.start();
	}
}
