package concurrence.cyclicbarrier;

/**
 * It uses the Results object that stores the number of appearances of the
 * number in each row of the matrix to make the calculation. Create a class
 * named Grouper and specify that it implements the Runnable interface.
 * 
 * @author jenny
 * 
 */
public class Grouper implements Runnable {

	// declare an object of result
	private Result result;

	/*
	 * implements the constructor method
	 */
	public Grouper(Result result) {
		this.result = result;
	}

	/*
	 * implement the run method
	 */
	public void run() {
		int finalResult = 0;
		System.out.printf("Grouper: Processing results...\n");
		int data[] = result.getData();
		for (int number : data) {
			finalResult += number;
		}
		System.out.printf("Grouper: Total result: %d.\n", finalResult);
	}

}
