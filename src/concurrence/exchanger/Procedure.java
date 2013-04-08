package concurrence.exchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

public class Procedure implements Runnable {

	// declare a list buffer as exchanger buffer
	private List<String> buffer;

	// declare a Exchanger for the List<String>
	private Exchanger<List<String>> exchanger;

	/*
	 * implement the constructor for Procedure
	 */
	public Procedure(List<String> buffer, Exchanger<List<String>> exchanger) {
		this.buffer = buffer;
		this.exchanger = exchanger;
	}

	/*
	 * implements of run method
	 */
	@Override
	public void run() {
		int cycle = 1;
		for (int i = 0; i < 10; i++) {
			System.out.printf("Producer: Cycle %d\n", cycle);
			for (int j = 0; j < 10; j++) {
				String message = "Event " + ((i * 10) + j);
				System.out.printf("Producer: %s\n", message);
				buffer.add(message);
			}
			try {
				buffer = exchanger.exchange(buffer);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Producer: " + buffer.size());
			cycle++;
		}

	}

}
