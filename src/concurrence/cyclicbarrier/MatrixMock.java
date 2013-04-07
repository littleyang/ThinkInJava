package concurrence.cyclicbarrier;

import java.util.Random;

/**
 * CyclicBarrier class to synchronize a set of threads in a determined point.
 * You will also use a Runnable object that will execute after all the threads
 * have arrived to that point. In the example, you will look for a number in a
 * matrix of numbers. The matrix will be divided in subsets (using the divide
 * and conquer technique), so each thread will look for the number in one
 * subset. Once all the threads have finished their job, a final task will unify
 * the results of them.
 * 
 * @author jenny
 */
public class MatrixMock {
	// Declare a private int matrix named data.
	private int data[][];

	/*
	 * Implement the constructor of the class. This constructor will receive the
	 * number of rows of the matrix, the length of each row, and the number we
	 * are going to look for as parameters. All the three parameters are of type
	 * int.
	 */
	public MatrixMock(int size, int length, int number) {
		int counter = 0;
		data = new int[size][length];
		Random random = new Random();
		/*
		 * to fill in the martix
		 */
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < length; j++) {
				data[i][j] = random.nextInt(10);
				if (data[i][j] == number) {
					counter++;
				}
			}
		}
		System.out.printf(
				"Mock: There are %d ocurrences of number in generated data.\n",
				counter, number);
	}

	/*
	 * the get row method return the row in martix
	 */
	public int[] getRow(int row) {
		if ((row >= 0) && (row < data.length)) {
			return data[row];
		}
		return null;
	}
}
