package concurrence.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * First,implement the Searcher class. This class will look for a number in
 * determined rows of the matrix of random numbers. Create a class named
 * Searcher and specify that it implements the Runnable interface.
 * 
 * @author jenny
 * 
 */
public class Searcher implements Runnable {

	// declare the first and last row
	private int firstRow;
	private int lastRow;

	// Declare a private MatrixMock attribute named mock.
	private MatrixMock mock;

	// declare the result
	private Result result;

	// declare a int number going to look for
	private int number;

	// declare a private cyclic barrier
	private CyclicBarrier barrier;

	/*
	 * implements the constructor method
	 */
	public Searcher(int firstRow, int lastRow, MatrixMock mock, Result result,
			int number, CyclicBarrier barrier) {

		this.barrier = barrier;
		this.mock = mock;
		this.result = result;
		this.firstRow = firstRow;
		this.lastRow = lastRow;
		this.number = number;
	}

	/*
	 * implements the run method
	 */
	@Override
	public void run() {
		int counter;
		System.out.printf("%s: Processing lines from %d to %d.\n", Thread
				.currentThread().getName(), firstRow, lastRow);
		for (int i = firstRow; i < lastRow; i++) {
			int row[] = mock.getRow(i);
			counter = 0;
			for (int j = 0; j < row.length; j++) {
				if (row[j] == number) {
					counter++;
				}
			}
			result.setData(i, counter);
		}
		System.out.printf("%s: Lines processed.\n", Thread.currentThread()
				.getName());
		try {
			barrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
