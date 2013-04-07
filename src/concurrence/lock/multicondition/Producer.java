package concurrence.lock.multicondition;

public class Producer implements Runnable {
	/*
	 * Declare two attributes: one object of the FileMock class and another
	 * object of the Buffer class.
	 */
	private FileMock mock;
	private Buffer buffer;

	/*
	 * Implement the constructor of the class that initializes both attributes.
	 */
	public Producer(FileMock mock, Buffer buffer) {
		this.mock = mock;
		this.buffer = buffer;
	}

	/*
	 * Implement the run() method that reads all the lines created in the
	 * FileMock object and uses the insert() method to store them in the buffer.
	 * Once it finishes, use the setPendingLines() method to alert the buffer
	 * that it's not going to generate more lines.
	 */
	@Override
	public void run() {
		buffer.setPendingLines(true);
		while (mock.hasMoreLines()) {
			String line = mock.getLine();
			buffer.insert(line);
		}
		buffer.setPendingLines(false);
	}
}
